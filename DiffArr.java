class DiffArr{

      static int[] intArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
      static float[] floatArr = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f};
      static long[] longArr = {100L, 200L, 300L, 400L, 500L, 600L, 700L, 800L, 900L, 1000L};
      static double[] doubleArr = {10.0, 20.5, 30.1, 40.6, 50.3, 60.9, 70.8, 80.2, 90.4, 100.0};
      static String[] stringArr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
      static short[] shortArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      static boolean[] boolArr = {true, false, true, false, true, false, true, false, true, false};
      static char[] charArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
      static byte[] byteArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

public static void main(String[] args){
	arrA(intArr);
	arrB(floatArr);
	arrC(longArr);
	arrD(doubleArr);
	arrE(stringArr);
	arrF(shortArr);
	arrG(boolArr);
	arrH(charArr);
	arrI(byteArr);
		
}

public static void arrA(int[] intArr){
	for(int i=0;i<intArr.length;i++){
		System.out.println("integer = "+intArr[i]); 
	}
}
public static void arrB(float[] floatArr){
	for(int i=0;i<floatArr.length;i++){
		System.out.println("float = "+floatArr[i]); 
	}
}
public static void arrC(long[] longArr){
	for(int i=0;i<longArr.length;i++){
		System.out.println("long = "+longArr[i]); 
	}
}
public static void arrD(double[] doubleArr){
	for(int i=0;i<doubleArr.length;i++){
		System.out.println("double = "+doubleArr[i]); 
	}
}
public static void arrE(String[] stringArr){
	for(int i=0;i<stringArr.length;i++){
		System.out.println("string = "+stringArr[i]); 
	}
}
public static void arrF(short[] shortArr){
	for(int i=0;i<shortArr.length;i++){
		System.out.println("short = "+shortArr[i]); 
	}
}
public static void arrG(boolean[] boolnArr){
	for(int i=0;i<boolArr.length;i++){
		System.out.println("boolean = "+boolArr[i]); 
	}
}
public static void arrH(char[] charArr){
	for(int i=0;i<charArr.length;i++){
		System.out.println("char = "+charArr[i]); 
	}
}
public static void arrI(byte[] byteArr){
	for(int i=0;i<byteArr.length;i++){
		System.out.println("byte = "+byteArr[i]); 
	}
}
}