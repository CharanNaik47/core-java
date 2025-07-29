class CarArrayRunner {
    public static void main(String[] args) {
        CarArray[] cars = new CarArray[3];

        CarArray c1 = new CarArray();
        c1.setModel("Toyota Fortuner");
        c1.setYear(2020);
		
        cars[0] = c1;

        CarArray c2 = new CarArray();
        c2.setModel("Tata Nexon");
        c2.setYear(2022);
		
        cars[1] = c2;

        CarArray c3 = new CarArray();
        c3.setModel("Mahindra Thar");
        c3.setYear(2023);
		
        cars[2] = c3;

        for (int i = 0; i < cars.length; i++) {
            CarArray c = cars[i];
            System.out.println("Model: " + c.getModel());
            System.out.println("Year: " + c.getYear());
            System.out.println();
        }
    }
}
