class Git2{
	 
	 static String name;
	 static float price=2.450000f;
	 static String color;
	 static int speed=50;
	 static boolean stock;
	 
	 public static void main(String[] args){
		 
		 String name=" ";
		 System.out.println(name);
		 
		 name="range rover";
		 System.out.println("Name= "+ name);
		 
		 System.out.println(carPrice());
		 System.out.println(carColor());
		 System.out.println(carSpeed());
		 System.out.println(Program29.name);
		 
		 Program29.car();
		 
	 }
		 
				 public static float carPrice(){
			 return price;
		 }
		 
		 
			 public static String carColor(){
				 String color="Blue";
				 return color;
			 }
			 
			 
			 public static int carSpeed(){
				 return speed;
			 }
			 
			 
			 
			 public static boolean carStock(){
				 boolean stock=true;
				 return stock;
			 }
			 
			 public static void car(){
				 System.out.println(price);
			 }
			 
		
}