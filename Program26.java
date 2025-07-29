class Program26 {

    static String brand = "Samsung";
    static String model = "Galaxy S22";
    static int ram = 8; // in GB
    static int storage = 128; // in GB
    static double price = 74999.99;

    public static void main(String[] args) {
        System.out.println("Phone Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("RAM: " + getRAM() + " GB");
        System.out.println("Storage: " + getStorage() + " GB");
        System.out.println("Price: ₹" + getPrice());
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public static int getRAM() {
        return ram;
    }

    public static int getStorage() {
        return storage;
    }

    public static double getPrice() {
        return price;
    }
}
