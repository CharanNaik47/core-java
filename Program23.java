class Program23{
	
	static int name="range rover";
	static String company="land rover";
	static float price=3.1400000f;
	static String color="Blue";
	static float milage=22.2f;
	public static void main(String[] args){
		
		int carName =nameOfCar();
		String carComp =compOfCar();
		float carPrice =priceOfCar();
		String carColor =colorOfCar();
		float carMilage =milageOfCar();
		
		System.out.println(carName);
		System.out.println(carComp);
		System.out.println(carPrice);
		System.out.println(carMilage);
		System.out.println(carColor);
		
	}
	
	public static int nameOfCar(){
		return name;
		
	}
	
	public static String compOfCar(){
		return company;
		
	}
	
	public static float priceOfCar(){
		return Price;
		
	}
	
	public static String colorOfCar(){
		return Color;
		
	}
	
	public static float milageOfCar(){
		return Milage;
		
	}
}