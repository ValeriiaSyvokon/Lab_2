//клас для спального вагона
class SleeperCar extends TrainCar {
    private final int comfortLevel;

    public SleeperCar(int passengers, int luggage, int comfortLevel) {
        super(passengers, luggage);
        this.comfortLevel = comfortLevel;
    }

    @Override
    public int getComfortLevel() {
        return comfortLevel;
    }
}