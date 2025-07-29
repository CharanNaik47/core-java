class Program34{
	
	static String t_item;
	static int t_id;
	static String t_to;
	static float t_price;
	static boolean t_address;
	
	public static void main(String[] args){
		
	String t_item="books";
	int t_id=271;
	String t_to="Gokarna";
	float t_price=599.00f;
	boolean t_address=true;
		
		System.out.println("Transaction item="+ t_item);
		System.out.println("Transaction id="+ t_id);
		System.out.println("Transaction to="+ t_to);
		System.out.println("Transaction price="+ t_price);
		System.out.println("Transaction address="+ t_address);
		
		System.out.println("Transaction item="+ transItem());
		System.out.println("Transaction id="+ transId());
		System.out.println("Transaction to="+ transTo());
		System.out.println("Transaction price="+ transPrice());
		System.out.println("Transaction address="+ transAddress());
		
	}
	
	public static String transItem(){        
	String t_item="laptop";
		return t_item;
	}
	
	public static int transId(){
		int t_id=342;
		return t_id;
	}
	
	public static String transTo(){
		String t_to="Karwar";
		return t_to;
	}
	
	public static float transPrice(){
		float t_price=74.677687f;
		return t_price;
	}
	
	public static boolean transAddress(){
		boolean t_address=false;
		return t_address;
	}
}