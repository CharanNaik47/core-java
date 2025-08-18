class DistrictRunner {
    public static void main(String[] args) {
        District d1 = new District("Bengaluru", 101, 2190.5f, "Karnataka", 8.4d);
        System.out.println(d1.getName());
        System.out.println(d1.getCode());
        System.out.println(d1.getArea());
        System.out.println(d1.getState());
        System.out.println(d1.getPopulation());
        System.out.println();

        District d2 = new District("Chennai", 102, 426f, "Tamil Nadu", 7.1d);
        System.out.println(d2.getName());
        System.out.println(d2.getCode());
        System.out.println(d2.getArea());
        System.out.println(d2.getState());
        System.out.println(d2.getPopulation());
        System.out.println();

        District d3 = new District("Mumbai", 103, 603.4f, "Maharashtra", 12.4d);
        System.out.println(d3.getName());
        System.out.println(d3.getCode());
        System.out.println(d3.getArea());
        System.out.println(d3.getState());
        System.out.println(d3.getPopulation());
        System.out.println();

        District d4 = new District("Kolkata", 104, 185.7f, "West Bengal", 4.5d);
        System.out.println(d4.getName());
        System.out.println(d4.getCode());
        System.out.println(d4.getArea());
        System.out.println(d4.getState());
        System.out.println(d4.getPopulation());
        System.out.println();

        District d5 = new District("Hyderabad", 105, 650f, "Telangana", 6.9d);
        System.out.println(d5.getName());
        System.out.println(d5.getCode());
        System.out.println(d5.getArea());
        System.out.println(d5.getState());
        System.out.println(d5.getPopulation());
        System.out.println();
    }
}