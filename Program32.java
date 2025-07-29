class Program32{
	
	static String e_name="Kartik";
	static int e_id=4700;
	static long e_salary=57000L;
	static String e_company;
	static char e_grade='A';
	
	public static void main(String[] args){
		
	String e_name="Anup";
	int e_id=7800;
	long e_salary=79000L;
	String e_company="Google";
	char e_grade='c';
		
		System.out.println("Employee name="+ e_name);
		System.out.println("Employee id="+ e_id);
		System.out.println("Employee salary="+ e_salary);
		System.out.println("Employee company="+ e_company);
		System.out.println("Employee grade="+ e_grade);
		
		System.out.println("Employee name="+ employee_name());
		System.out.println("Employee id="+ employee_id());
		System.out.println("Employee salary="+ employee_salary());
		System.out.println("Employee company="+ employee_company());
		System.out.println("Employee grade="+ employee_grade());
		
	}
	
	public static String employee_name(){
		return e_name;
	}
	
	public static int employee_id(){
		return e_id;
	}
	
	public static long employee_salary(){
		return e_salary;
	}
	
	public static String employee_company(){
		String e_company="Infosys";
		return e_company;
	}
	
	public static char employee_grade(){
		return e_grade;
	}
}