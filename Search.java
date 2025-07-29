class Search{
	
	static int[] intArr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    static float[] floatArr =new float[] {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f};
    static long[] longArr = new long[]{100L, 200L, 300L, 400L, 500L, 600L, 700L, 800L, 900L, 1000L};
    static double[] doubleArr = new double[]{10.0, 20.5, 30.1, 40.6, 50.3, 60.9, 70.8, 80.2, 90.4, 100.0};
    static String[] stringArr = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    static short[] shortArr =new short[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static boolean[] boolArr = new boolean[]{true, false, true, false, true, false, true, false, true, false};
    static char[] charArr =new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    static byte[] byteArr =new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

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