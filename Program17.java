class Program17{
	public static void main(String[] args){
		
		addition1(10,20);
		addition2((short)10,(short)20);
		addition3(100000000l,200000000L);
		addition4(10.00f,20.00f);
		addition5(10.1000000,20.100000);
		addition6(true,false);
	}
	
	public static void addition1(int a,int b){
		int c=a+b;
		System.out.println("Addition1 =" +c);
	}
	
	public static void addition2(short a,short b){
		short c=(short)(a+b);
		System.out.println("Addition2 =" +c);
	}
	
			public static void addition3(long a,long b){
		long c=a+b;
		System.out.println("Addition3 =" +c);
	}
	
	public static void addition4(float a,float b){
		float c=a+b;
		System.out.println("Addition4 =" +c);
	}
	
	public static void addition5(double a,double b){
		double c=a+b;
		System.out.println("Addition5 =" +c);
	}
	
	public static void addition6(boolean a,boolean b){
		int a1=a? 1:0;
		int b1=b? 1:0;
		int c=a1+b1;
		System.out.println("Addition6 =" +c);
	}
}