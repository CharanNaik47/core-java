class Program17{
	public static void main(String[] args){
		
		addition(10,20);
		addition(100000000l,200000000L);
		addition(10.00f,20.00f);
		addition(10.1000000,20.100000);
		addition(true,false);
	}
	
	public static void addition(int a,int b){
		int c=a+b;
		System.out.println("Addition1 =" +c);
	}
	
			public static void addition(long a,long b){
		long c=a+b;
		System.out.println("Addition2 =" +c);
	}
	
	public static void addition(float a,float b){
		float c=a+b;
		System.out.println("Addition3 =" +c);
	}
	
	public static void addition(double a,double b){
		double c=a+b;
		System.out.println("Addition4 =" +c);
	}
}