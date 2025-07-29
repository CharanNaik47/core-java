class Program18{
	public static void main(String[] args){
		
		substract1(30,20);
		substract2((short)35,(short)20);
		substract3(300000000l,200000000L);
		substract4(30.00f,20.00f);
		substract5(30.1000000,20.100000);
		substract6(true,false);
	}
	
	public static void substract1(int a,int b){
		int c=a-b;
		System.out.println("substract1 =" +c);
	}
	
	public static void substract2(short a,short b){
		short c=(short)(a-b);
		System.out.println("substract2 =" +c);
	}
	
			public static void substract3(long a,long b){
		long c=a-b;
		System.out.println("substract3 =" +c);
	}
	
	public static void substract4(float a,float b){
		float c=a-b;
		System.out.println("substract4 =" +c);
	}
	
	public static void substract5(double a,double b){
		double c=a-b;
		System.out.println("substract5 =" +c);
	}
	
	public static void substract6(boolean a,boolean b){
		int a1=a? 1:0;
		int b1=b? 1:0;
		int c=a1-b1;
		System.out.println("substract6 =" +c);
	}
}