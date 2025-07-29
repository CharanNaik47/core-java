class CarDetails {
    public static void main(String[] args) {
        String[] brands = {"Honda", "Hyundai", "Maruti", "Toyota", "Ford", "BMW", "Audi", "Tata", "Mahindra", "Kia"};
        int[] modelYears = {2020, 2019, 2018, 2021, 2022, 2023, 2020, 2019, 2017, 2021};
        float[] mileage = {18.5f, 20.1f, 21.0f, 15.3f, 14.2f, 12.5f, 13.0f, 17.5f, 16.2f, 19.1f};
        char[] fuelType = {'P','D','P','D','P','P','D','P','D','P'};
        double[] price = {800000, 700000, 600000, 1200000, 900000, 5000000, 6000000, 850000, 750000, 950000};

        for (int i = 0; i < brands.length; i++) {
            System.out.println("Brand: " + brands[i] + ", Year: " + modelYears[i] +
                               ", Mileage: " + mileage[i] + ", Fuel: " + fuelType[i] +
                               ", Price: " + price[i]);
        }
    }
}
