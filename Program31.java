class Program31{
	
	static String c_name="BMW";
	static int c_id=4700;
	static double c_price=3.10000d;
	static String c_model="320d";
	static float c_rating=7.8f;
	
	public static void main(String[] args){
		
	String c_name="Land Rover";
	int c_id=6900;
	double c_price=5.14000d;
	String c_model="defender";
	float c_rating=9.1f;
		
		System.out.println("Car name="+ C_name);
		System.out.println("Car id="+ c_id);
		System.out.println("Car price="+ c_price);
		System.out.println("Car model="+ c_model);
		System.out.println("Car rating="+ c_rating);
		
		System.out.println("Student name="+ Car_name());
		System.out.println("Student id="+ Car_id());
		System.out.println("Student percentage="+ Car_price());
		System.out.println("Student blood group="+ Car_model());
		System.out.println("Student pass="+ Car_rating());
		
	}
	
	public static String Car_name(){
		return c_name;
	}
	
	public static int Car_id(){
		return c_id;
	}
	
	public static double Car_price(){
		return c_price;
	}
	
	public static String Car_model(){
		return c_model;
	}
	
	public static float Car_rating(){
		return c_rating;
	}
}