class District {

    private String name;
    private int code;
    private float area;
    private String state;
    private double population;

    public District() {
    }

    public District(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public District(String name, int code, float area) {
        this.name = name;
        this.code = code;
        this.area = area;
    }

    public District(String name, int code, float area, String state) {
        this(name, code, area);
        this.state = state;
    }

    public District(String name, int code, float area, String state, double population) {
        this(name, code, area, state);
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public float getArea() {
        return area;
    }

    public String getState() {
        return state;
    }

    public double getPopulation() {
        return population;
    }
}