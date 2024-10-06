//узагальнений клас для вагонів
public abstract class TrainCar {
    protected int passengers;
    protected int luggage;

    public TrainCar(int passengers, int luggage) {
        this.passengers = passengers;
        this.luggage = luggage;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getLuggage() {
        return luggage;
    }

    //абстрактний метод для отримання рівня комфортності
    public abstract int getComfortLevel();
}