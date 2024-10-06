//клас для вагона-ресторану
class DiningCar extends TrainCar {
    private final int comfortLevel;

    public DiningCar(int passengers, int luggage, int comfortLevel) {
        super(passengers, luggage);
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getComfortLevel() {
        return comfortLevel;
    }
}