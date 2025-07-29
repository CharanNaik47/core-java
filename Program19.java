class Program19{
	public static void main(String[] args){
		
		multiplication1(20,40);
		multiplication2((short)32,(short)30);
		multiplication3(200000000L,400000000L);
		multiplication4(20.00f,40.00f);
		multiplication5(20.1000000,20.100000);
		multiplication6(true,false);
	}
	
	public static void multiplication1(int a,int b){
		int c=a*b;
		System.out.println("multiplication1 =" +c);
	}
	
	public static void multiplication2(short a,short b){
		short c=(short)(a*b);
		System.out.println("multiplication2 =" +c);
	}
	
			public static void multiplication3(long a,long b){
		long c=a*b;
		System.out.println("multiplication3 =" +c);
	}
	
	public static void multiplication4(float a,float b){
		float c=a*b;
		System.out.println("multiplication4 =" +c);
	}
	
	public static void multiplication5(double a,double b){
		double c=a*b;
		System.out.println("multiplication5 =" +c);
	}
	
	public static void multiplication6(boolean a,boolean b){
		int a1=a? 1:0;
		int b1=b? 1:0;
		int c=a1*b1;
		System.out.println("multiplication6 =" +c);
	}
}