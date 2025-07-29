class C_mart{
	 
	 static String b_name="Dinesh";
	 static int b_Rno=119;
	 static long b_Mno=6364732220L;
	 static float b_Tamt=809.6f;
	 
	 public static void main(String[]  args){
		 
     String b_name="Ganesh";
	 int b_no=543;
	 long b_Mno=8277519575L;
	 float b_Tamt=495.20f;
	
	System.out.println("Buyer Name="+ b_name);
	System.out.println("Buyer Recipt No="+ b_Rno);
	System.out.println("Buyer Mobile No="+ b_Mno);
	System.out.println("Buyer Total Amount="+ b_Tamt);
	
	System.out.println("Buyer Name="+ name());
	System.out.println("Buyer Recipt No="+ reciptno());
	System.out.println("Buyer Mobile No="+ mnum());
	System.out.println("Buyer Total Amount="+ totalamt());
	 }
	
	public static String name(){
		return b_name;
	
	}
	public static int reciptno(){
		return b_Rno;
	}
	
	public static long mnum(){
		return b_Mno;
	}
	
	public static float totalamt(){
		return b_Tamt;
	}
	 }