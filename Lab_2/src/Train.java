import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//клас для поїзда
public class Train {
    private final List<TrainCar> cars = new ArrayList<>();

    public void addCar(TrainCar car) {
        cars.add(car);
    }

    //підрахунок загальної кількості пасажирів
    public int getTotalPassengers() {
        int allPassengers = 0;
        for (TrainCar car : cars) {
            allPassengers += car.getPassengers();
        }
        return allPassengers;
    }

    //підрахунок загальної кількості багажу
    public int getTotalLuggage() {
        int allLuggage = 0;
        for (TrainCar car : cars) {
            allLuggage += car.getLuggage();
        }
        return allLuggage;
    }

    //сортування вагонів за рівнем комфортності
    public void sortCarsByComfort() {
        cars.sort(Comparator.comparingInt(TrainCar::getComfortLevel));

    }

    //вивести всі вагони
    public void displayCars() {
        for (TrainCar car : cars) {
            System.out.println("Вагон: Комфорт " + car.getComfortLevel() + ", Пасажири: " + car.getPassengers() + ", Багаж: " + car.getLuggage());
        }
    }

    //пошук вагона за кількістю пасажирів у заданому діапазоні
    public TrainCar findCarByPassengerRange(int min, int max) {
        for (TrainCar car : cars) {
            if (car.getPassengers() >= min && car.getPassengers() <= max) {
                return car;
            }
        }
        return null;
    }
}