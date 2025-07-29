class Search1{
	
	static int[] intArr = new int[5];
	static float[] floatArr =new float[5];
	static long[] longArr = new long[5];
	static double[] doubleArr = new double[5];
	static String[] stringArr = new String[5];
	static short[] shortArr =new short[5];
	static boolean[] boolArr = new boolean[5];
	static char[] charArr =new char[5];
	static byte[] byteArr =new byte[5];
	  
	static{ 
	for(int i=0;i<intArr.length;i++){
		intArr[i]=i+5;
	}
		
	for(int i=0;i<floatArr.length;i++){
		floatArr[i]=i+5.78f;
	}
	
   	for(int i=0; i<longArr.length;i++){
		longArr[i]=i+211111112L;
	}
	
    	for(int i=0;i<doubleArr.length;i++){
		doubleArr[i]=i+5.5d;
	}
	
   	for(int i=0;i<stringArr.length;i++){
		stringArr[i]="name "+i;
	}
	
    	for(int i=0;i<shortArr.length;i++){
		shortArr[i]=(short)(i+7);
	}
	
	for(int i=0;i<boolArr.length;i++){
		boolArr[i]=false;
	}
	
	for(int i=0;i<charArr.length;i++){
		charArr[i]='C';
	}
	
	for(int i=0;i<byteArr.length;i++){
		byteArr[i]=(byte)(i*2);
	}
	}

public static void main(String[] args){
	
	arrA();
	arrB();
	arrC();
	arrD();
	arrE();
	arrF();
	arrG();
	arrH();
	arrI();
		
}

public static void arrA(){
	for(int i=0;i<intArr.length;i++){
		System.out.println("integer = "+intArr[i]); 
	}
}
public static void arrB(){
	for(int i=0;i<floatArr.length;i++){
		System.out.println("float = "+floatArr[i]); 
	}
}
public static void arrC(){
	for(int i=0;i<longArr.length;i++){
		System.out.println("long = "+longArr[i]); 
	}
}
public static void arrD(){
	for(int i=0;i<doubleArr.length;i++){
		System.out.println("double = "+doubleArr[i]); 
	}
}
public static void arrE(){
	for(int i=0;i<stringArr.length;i++){
		System.out.println("string = "+stringArr[i]); 
	}
}
public static void arrF(){
	for(int i=0;i<shortArr.length;i++){
		System.out.println("short = "+shortArr[i]); 
	}
}
public static void arrG(){
	for(int i=0;i<boolArr.length;i++){
		System.out.println("boolean = "+boolArr[i]); 
	}
}
public static void arrH(){
	for(int i=0;i<charArr.length;i++){
		System.out.println("char = "+charArr[i]); 
	}
}
public static void arrI(){
	for(int i=0;i<byteArr.length;i++){
		System.out.println("byte = "+byteArr[i]); 
	}
}
}