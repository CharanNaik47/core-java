class Library{
	 
	 static String b_name="java";
	 static int b_no=119;
	 static char b_grade='B';
	 static float b_price=89.6f;
	 
	 public static void main(String[]  args){
		 
     String b_name="Python";
	 int b_no=569;
	 char b_grade='A';
	 float b_price=80.6f;
	
	System.out.println("Book Name="+ b_name);
	System.out.println("Book Series No="+ b_no);
	System.out.println("Book Grade="+ b_grade);
	System.out.println("Book Price="+ b_price);
	
	System.out.println("Book Name="+ name_print());
	System.out.println("Book Series No="+ no_print());
	System.out.println("Book Grade="+ grade_print());
	System.out.println("Book Price="+ price_print());
	 }
	
	public static String name_print(){
		return b_name;
	
	}
	public static int no_print(){
		return b_no;
	}
	
	public static char grade_print(){
		return b_grade;
	}
	
	public static float price_print(){
		return b_price;
	}
	 }