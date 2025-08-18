class Car1 {
	private String name;
	private int wheels;
	private String color;
	//private String features;
	//private String fuelType;
	private Engine engine;

	public Car1(String name, int wheels, String color){
	this.name = name;
	this.wheels = wheels;
	this.color = color;
	

	}
	public Car1(String name, int wheels, String color, Engine engine){
	this(name,wheels,color);
	this.engine = engine;
	}
	public void setEngine(Engine engine) {
	this.engine = engine;
	}

	public Engine getEngine(){
	return  engine;
	}

	public String getName(){
	return name;
	}

	public String getColor(){
	return color;
	}

	public int getWheels(){
	return wheels;
	}
}