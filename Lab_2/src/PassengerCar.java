//клас для звичайного пасажирського вагона
class PassengerCar extends TrainCar {
    private final int comfortLevel;

    public PassengerCar(int passengers, int luggage, int comfortLevel) {
        super(passengers, luggage);
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getComfortLevel() {
        return comfortLevel;
    }
}