class Program30{
	
	static String name="Shreyas";
	static int id=47;
	static float percentage=6.9f;
	static char bgroup='A';
	static boolean pass;
	
	public static void main(String[] args){
		
		String schoolName="PMHS";
		int scl_Id=459;
		char scl_grd='B';
		String scl_adrs="Ankola";
		float scl_per=8.7f;
		
		System.out.println("School name="+ schoolName);
		System.out.println("School id="+ scl_Id);
		System.out.println("School grade="+ scl_grd);
		System.out.println("School address="+ scl_adrs);
		System.out.println("School percentage="+ scl_per);
		
		System.out.println("Student name="+ Student_name());
		System.out.println("Student id="+ Student_id());
		System.out.println("Student percentage="+ Student_percenage());
		System.out.println("Student blood group="+ Student_bGroup());
		System.out.println("Student pass="+ Student_pass());
		
	}
	
	public static String Student_name(){
		return name;
	}
	
	public static int Student_id(){
		return id;
	}
	
	public static float Student_percenage(){
		return percentage;
	}
	
	public static char Student_bGroup(){
		return bgroup;
	}
	
	public static boolean Student_pass(){
		boolean pass= true;
		return pass;
	}
}