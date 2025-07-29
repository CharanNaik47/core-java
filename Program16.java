class Program16{
	public static void main(String[] args){
		
		addition(100,200);
		addn();
		substract(30,15);
		multiplication(5,10);
		calculation(5,4);
	}
		
		public static void addition(int a,int b){
			int x=a+b;
			System.out.println("Addition=" +x);
	}
	
	public static void addn(){
		int m=10;
		byte n=120;
		int c=m+n;
		
		System.out.println("Addition=" +c);
		}
	
	
	
	
	public static void substract(int a,int c){
		int y=a-c;
		System.out.println("substract="+y);
}

public static void multiplication(int a,int b){
	 
	 System.out.println("multiplication="+ a*b);
}




public static void calculation(int a,int b){
	 
	 System.out.println("Add="+ (a+b)+ ", Sub="+( a-b )+ ", multi=" + (a*b) + ", div=" +(a/b));
}
}