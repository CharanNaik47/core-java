class Program27{
	public static void main(String[] args){
		
		division1();
		division2();
		division3();
		division4();
		division5();
		
		System.out.println("division1 =" + division1());
		System.out.println("division2 =" + division2());
	    System.out.println("division3=" + division3());
		System.out.println("division4 =" + division4());
		System.out.println("division5 =" + division5());
	}
	
	public static int division1(){
		int a =50;
		int b= 10;
		int c=a/b;
		return c;
	}
	
	public static short division2(){
		short a=32;
		short b=20;
		short c=(short)(a/b);
		return c;
	
	}
	
	public static long division3(){
		long a= 500000000L;
		long b= 100000000L;
		long c=a/b;
		return c;
	}
	
	public static float division4(){
		float a= 50.00f;
		float b= 10.00f;
		float c=a/b;
		return c;
	}
	
	public static double division5(){
		double a= 50.24345;
		double b= 10.4555;
		double c=a/b;
		return c;
	}
	
	
}