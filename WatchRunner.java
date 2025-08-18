class WatchRunner {
    public static void main(String[] args) {
        Watches w1 = new Watches("Rolex", 101, 95000f, "Luxury", 4.8d);
        System.out.println(w1.getBrand());
        System.out.println(w1.getModelNo());
        System.out.println(w1.getPrice());
        System.out.println(w1.getType());
        System.out.println(w1.getRating());
        System.out.println();

        Watches w2 = new Watches("Casio", 202, 5000f, "Digital", 4.5d);
        System.out.println(w2.getBrand());
        System.out.println(w2.getModelNo());
        System.out.println(w2.getPrice());
        System.out.println(w2.getType());
        System.out.println(w2.getRating());
        System.out.println();

        Watches w3 = new Watches("Titan", 303, 3500f, "Analog", 4.2d);
        System.out.println(w3.getBrand());
        System.out.println(w3.getModelNo());
        System.out.println(w3.getPrice());
        System.out.println(w3.getType());
        System.out.println(w3.getRating());
        System.out.println();

        Watches w4 = new Watches("Apple", 404, 42000f, "Smartwatch", 4.9d);
        System.out.println(w4.getBrand());
        System.out.println(w4.getModelNo());
        System.out.println(w4.getPrice());
        System.out.println(w4.getType());
        System.out.println(w4.getRating());
        System.out.println();

        Watches w5 = new Watches("Fastrack", 505, 2200f, "Youth", 4.0d);
        System.out.println(w5.getBrand());
        System.out.println(w5.getModelNo());
        System.out.println(w5.getPrice());
        System.out.println(w5.getType());
        System.out.println(w5.getRating());
        System.out.println();
    }
}