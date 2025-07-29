class Program24 {

    static String brand = "Toyota";
    static String model = "Fortuner";
    static int year = 2022;
    static double price = 32.5;
    static String color = "Black";

    public static void main(String[] args) {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Price: $" + getPrice());
        System.out.println("Color: " + getColor());
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public static int getYear() {
        return year;
    }

    public static double getPrice() {
        return price;
    }

    public static String getColor() {
        return color;
    }
}
