class ParkingSystem {
    int[] size = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        size[0] = big;
        size[1] = medium;
        size[2] = small;
    }

    public boolean addCar(int carType) {
        return size[carType - 1]-- > 0;
    }
}