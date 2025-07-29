class College{
	 
	 static String s_name="vinyas";
	 static int s_rollNo=19;
	 static char s_clas='B';
	 static float s_percentage=89.6f;
	 
	 class Student{
     static String s_name="Akash";
	 static int rollNo=06;
	 static char clas='A';
	 static float percentage=81.3f;
	 
	 public static void main(String[]  args){
		 
    String s_name="Bhavish";
	int s_rollNo=17;
	char s_clas='B';
	float s_percentage=95.1f;
	
	System.out.println("Student Name="+ s_name);
	System.out.println("Student Name="+ s_rollNo);
	System.out.println("Student Name="+ s_clas);
	System.out.println("Student Name="+ s_percentage);
	
	System.out.println("Student Name="+ name_print());
	System.out.println("Student Name="+ roll_print());
	System.out.println("Student Name="+ clas_print());
	System.out.println("Student Name="+ per_print());
	 }
	
	public static String name_print(){
		return College.s_name;
		return s_name;
	}
	public static int roll_print(){
		return College.s_rollNo;
		return s_rollNo;
	}
	public static char clas_print(){
		return college.s_clas;
		return s_clas;
	}
	public static float per_print(){
		return College.s_percentage;
		return s_percentage;
	}
	 }
	 }