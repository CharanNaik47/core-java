class Program28{
	public static void main(String[] args){
		
		
		System.out.println("multiplication1 =" +multiplication1(20,30));

		System.out.println("multiplication2 =" +multiplication2((short)32,(short)30));
		
		System.out.println("multiplication3 =" +multiplication3(200000000L,400000000L));

		System.out.println("multiplication4 =" +multiplication4(20.00f,40.00f));
		
		System.out.println("multiplication5 =" +multiplication5(20.1000000,20.100000));
		
	}
	
	public static int multiplication1(int a,int b){
		int c=a*b;
		return c;
		
	}
	
	public static short multiplication2(short a,short b){
		short c=(short)(a*b);
		return c;
	}

				public static long multiplication3(long a,long b){
		 long c=a*b;
		 return c;
		
	}
	
	public static float multiplication4(float a,float b){
		float c=a*b;
		return c;
	}
	
	public static double multiplication5(double a,double b){
		double c=a*b;
		return c;
		
	}
	
	
}