class Company{
	 
	 static String e_name="Mantan";
	 static int e_Rno=289;
	 static long e_Mno=6364732220L;
	 static float e_Salary=80.196f;
	 
	 public static void main(String[]  args){
		 
     String e_name="Sanath";
	 int e_Rno=513;
	 long e_Mno=8277519575L;
	 float e_Salary=49.520f;
	
	System.out.println("Employee Name="+ e_name);
	System.out.println("Employee Regi. No="+ e_Rno);
	System.out.println("Employee Mobile No="+ e_Mno);
	System.out.println("Employee Salary="+ e_Salary);
	
	System.out.println("Employee Name="+ name());
	System.out.println("Employee Regi. No="+ regino());
	System.out.println("Employee Mobile No="+ mnum());
	System.out.println("Employee Salary="+ salary());
	 }
	
	public static String name(){
		return e_name;
	
	}
	public static int regino(){
		return e_Rno;
	}
	
	public static long mnum(){
		return e_Mno;
	}
	
	public static float salary(){
		return e_Salary;
	}
	 }