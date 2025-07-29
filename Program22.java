class Program22{
	
	static int number=12;
	static String company="BMW";
	static float Price=2.1400000f;
	static String Color="Blue";
	static float Milage=12.2f;
	public static void main(String[] args){
		
		int bikeNumber =nameOfBike();
		String bikeComp =compOfBike();
		float bikePrice =priceOfBike();
		String bikeColor =colorOfBike();
		float bikeMilage =milageOfBike();
		
		System.out.println(bikeNumber);
		System.out.println(bikeComp);
		System.out.println(bikePrice);
		System.out.println(bikeMilage);
		System.out.println(bikeColor);
		
	}
	
	public static int nameOfBike(){
		return number;
		
	}
	
	public static String compOfBike(){
		return company;
		
	}
	
	public static float priceOfBike(){
		return Price;
		
	}
	
	public static String colorOfBike(){
		return Color;
		
	}
	
	public static float milageOfBike(){
		return Milage;
		
	}
}