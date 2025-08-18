class Watches {

    private String brand;
    private int modelNo;
    private float price;
    private String type;
    private double rating;

    public Watches() {
    }

    public Watches(String brand, int modelNo) {
        this.brand = brand;
        this.modelNo = modelNo;
    }

    public Watches(String brand, int modelNo, float price) {
        this.brand = brand;
        this.modelNo = modelNo;
        this.price = price;
    }

    public Watches(String brand, int modelNo, float price, String type) {
        this(brand, modelNo, price);
        this.type = type;
    }

    public Watches(String brand, int modelNo, float price, String type, double rating) {
        this(brand, modelNo, price, type);
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public int getModelNo() {
        return modelNo;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public double getRating() {
        return rating;
    }
}
