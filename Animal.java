class Animal{
	
	static String a_name;
	static int a_id;
	static float a_weight;
	static String a_color;
	static boolean a_animal;
	
	public static void main(String[] args){
		
	String a_name="Lion";
	int a_id=27;
	float a_weight=80.7f;
	String a_color="Orange";
	boolean a_animal= true;
		
		System.out.println("Animal name="+ a_name);
		System.out.println("Animal id="+ a_id);
		System.out.println("Animal weight="+ a_weight);
		System.out.println("Animal color="+ a_color);
		System.out.println("Animal ?="+ a_animal);
		
		System.out.println("Animal name="+ animalName());
		System.out.println("Animal id="+ animalId());
		System.out.println("Animal salary="+ animalWeight());
		System.out.println("Animal color="+ animalColor());
		System.out.println("Animal ?="+ animal());
		
	}
	
	public static String animalName(){        
	String a_name="Hen";
		return a_name;
	}
	
	public static int animalId(){
		int a_id=342;
		return a_id;
	}
	
	public static float animalWeight(){
		float a_weight=2.2f;
		return a_weight;
	}
	
	public static String animalColor(){
		String a_color="Infosys";
		return a_color;
	}
	
	public static boolean animal(){
		boolean a_animal=false;
		return a_animal;
	}
}