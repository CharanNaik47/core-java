class CityArrayRunner {
    public static void main(String[] args) {
        CityArray[] cities = new CityArray[5];

        CityArray c1 = new CityArray();
        c1.setName("Mumbai");
        c1.setPopulation(20000000);

        CityArray c2 = new CityArray();
        c2.setName("Delhi");
        c2.setPopulation(18000000);

        CityArray c3 = new CityArray();
        c3.setName("Bangalore");
        c3.setPopulation(12000000);

        CityArray c4 = new CityArray();
        c4.setName("Hyderabad");
        c4.setPopulation(10000000);

        CityArray c5 = new CityArray();
        c5.setName("Chennai");
        c5.setPopulation(9000000);

        for (int i = 0; i < cities.length; i++) {
            if (i == 0) cities[i] = c1;
            else if (i == 1) cities[i] = c2;
            else if (i == 2) cities[i] = c3;
            else if (i == 3) cities[i] = c4;
            else if (i == 4) cities[i] = c5;
        }

        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                System.out.println("City: " + cities[i].getName());
                System.out.println("Population: " + cities[i].getPopulation());
                System.out.println();
            }
        }
    }
}
