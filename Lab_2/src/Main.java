//КМ-33, Сивоконь Валерія, варіант 7

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train = new Train();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Додати вагон");
            System.out.println("2. Порахувати загальну чисельність пасажирів");
            System.out.println("3. Порахувати загальну кількість багажу");
            System.out.println("4. Провести сортування вагонів за рівнем комфортності");
            System.out.println("5. Знайти вагон за кількістю пасажирів");
            System.out.println("6. Вивести всі вагони");
            System.out.println("0. Вийти");
            System.out.print("Оберіть дію: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //додати вагон
                    addCarToTrain(scanner, train);
                    break;
                case 2:
                    //порахувати загальну чисельність пасажирів
                    System.out.println("Загальна кількість пасажирів: " + train.getTotalPassengers());
                    break;
                case 3:
                    //порахувати загальну кількість багажу
                    System.out.println("Загальна кількість багажу: " + train.getTotalLuggage());
                    break;
                case 4:
                    //провести сортування вагонів за рівнем комфортності
                    train.sortCarsByComfort();
                    System.out.println("Вагони відсортовані за рівнем комфортності.");
                    break;
                case 5:
                    //знайти вагон за кількістю пасажирів
                    System.out.print("Введіть мінімальну кількість пасажирів: ");
                    int min = scanner.nextInt();
                    System.out.print("Введіть максимальну кількість пасажирів: ");
                    int max = scanner.nextInt();
                    TrainCar foundCar = train.findCarByPassengerRange(min, max);
                    if (foundCar != null) {
                        System.out.println("Знайдено вагон з пасажирами в діапазоні: " + foundCar.getPassengers());
                    } else {
                        System.out.println("Не знайдено вагон з такою кількістю пасажирів.");
                    }
                    break;
                case 6:
                    //вивести всі вагони
                    train.displayCars();
                    break;
                case 0:
                    //вийти з програми
                    running = false;
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }

        scanner.close();
    }

    //метод для додавання вагона
    public static void addCarToTrain(Scanner scanner, Train train) {
        System.out.println("Оберіть тип вагона:");
        System.out.println("1. Пасажирський вагон");
        System.out.println("2. Спальний вагон");
        System.out.println("3. Вагон-ресторан");
        int type = scanner.nextInt();

        System.out.print("Введіть кількість пасажирів: ");
        int passengers = scanner.nextInt();
        System.out.print("Введіть кількість багажу: ");
        int luggage = scanner.nextInt();
        System.out.print("Введіть рівень комфортності: ");
        int comfortLevel = scanner.nextInt();

        //поліморфізм
        switch (type) {
            case 1:
                train.addCar(new PassengerCar(passengers, luggage, comfortLevel));
                break;
            case 2:
                train.addCar(new SleeperCar(passengers, luggage, comfortLevel));
                break;
            case 3:
                train.addCar(new DiningCar(passengers, luggage, comfortLevel));
                break;
            default:
                System.out.println("Невірний тип вагона.");
        }

        System.out.println("Вагон успішно доданий.");
    }
}
