class EngineRunner {


public static void main(String[] args){
Car1 car1 = new Car1("Toyota", 4, "white");
Engine engine = new Engine("twin turbo",1999, "Toyota");
car1.setEngine(engine);

System.out.println("Car details =================================");
System.out.println(car1.getName());
System.out.println(car1.getColor());
System.out.println(car1.getWheels());

Engine engine1 = car1.getEngine();
System.out.println("Car engine details========================");
System.out.println(engine1.getName());
System.out.println(engine1.getEngineType());
System.out.println(engine1.getEngineCC());
}
}