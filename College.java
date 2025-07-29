class College{
	 
	 static String s_name="vinyas";
	 static int s_rollNo=19;
	 static char s_clas='B';
	 static float s_percentage=89.6f;
	 
	 public static void main(String[]  args){
		 
    String s_name="Bhavish";
	int s_rollNo=17;
	char s_clas='B';
	float s_percentage=95.1f;
	
	System.out.println("Student Name="+ s_name);
	System.out.println("Student Name="+ s_rollNo);
	System.out.println("Student Name="+ s_clas);
	System.out.println("Student Name="+ s_percentage);
	
	System.out.println("Student Name="+ name());
	System.out.println("Student Name="+ roll());
	System.out.println("Student Name="+ clas());
	System.out.println("Student Name="+ per());
	 }
	
	public static String name(){
		return s_name;
	
	}
	public static int roll(){
		return s_rollNo;
	}
	
	public static char clas(){
		return s_clas;
	}
	
	public static float per(){
		return s_percentage;
	}
	 }