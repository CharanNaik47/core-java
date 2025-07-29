class Program20{
	public static void main(String[] args){
		
		division1();
		division2();
		division3();
		division4();
		division5();
		division6(true,false);
	}
	
	public static void division1(){
		int a =50;
		int b= 10;
		int c=a/b;
		System.out.println("division1 =" +c);
	}
	
	public static void division2(){
		short a=32;
		short b=20;
		short c=(short)(a/b);
		System.out.println("division2 =" +c);
	}
	
	public static void division3(){
		long a= 500000000L;
		long b= 100000000L;
		long c=a/b;
		System.out.println("division3 =" +c);
	}
	
	public static void division4(){
		float a= 50.00f;
		float b= 10.00f;
		float c=a/b;
		System.out.println("division4 =" +c);
	}
	
	public static void division5(){
		double a= 50.24345;
		double b= 10.4555;
		double c=a/b;
		System.out.println("division5 =" +c);
	}
	
	public static void division6(boolean a,boolean b){
		int a1=a? 1:0;
		int b1=b? 1:0;
		int c=a1/b1;
		System.out.println("division6 =" +c);
	}
}