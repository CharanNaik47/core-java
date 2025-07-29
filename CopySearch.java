class CopySearch{
	
	public static void main(String[] args){
		
	int[] intArr = new int[5];
	float[] floatArr =new float[5];
	long[] longArr = new long[5];
	double[] doubleArr = new double[5];
	String[] stringArr = new String[5];
	short[] shortArr =new short[5];
	boolean[] boolArr = new boolean[5];
	char[] charArr =new char[5];
    byte[] byteArr =new byte[5];
	  
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
	
	int[] copyIntArr = new int[intArr.length];
	float[] copyFloatArr =new float[floatArr.length];
	long[] copyLongArr = new long[longArr.length];
	double[] copyDoubleArr = new double[doubleArr.length];
	String[] copyStringArr = new String[stringArr.length];
	short[] copyShortArr =new short[shortArr.length];
	boolean[] copyBoolArr = new boolean[boolArr.length];
	char[] copyCharArr =new char[charArr.length];
	byte[] copyByteArr =new byte[byteArr.length];
 
	for(int i=0;i<intArr.length;i++){
		copyIntArr[i]=intArr[i];
	}
		
	for(int i=0;i<floatArr.length;i++){
		copyFloatArr[i]=floatArr[i];
	}
	
   	for(int i=0; i<longArr.length;i++){
		copyLongArr[i]=longArr[i];
	}
	
    for(int i=0;i<doubleArr.length;i++){
		copyDoubleArr[i]=doubleArr[i];
	}
	
   	for(int i=0;i<stringArr.length;i++){
		copyStringArr[i]=stringArr[i];
	}
	
    for(int i=0;i<boolArr.length;i++){
		copyBoolArr[i]=boolArr[i];
	}
	
	for(int i=0;i<shortArr.length;i++){
		copyShortArr[i]=shortArr[i];
	}
	
	for(int i=0;i<charArr.length;i++){
		copyCharArr[i]=charArr[i];
	}
	for(int i=0;i<byteArr.length;i++){
		copyByteArr[i]=byteArr[i];
	}
	
	
	
	for(int i=0;i<copyIntArr.length;i++){
	System.out.println(copyIntArr[i]);
	}
	for(int i=0;i<copyFloatArr.length;i++){
	System.out.println(copyFloatArr[i]);
	}
	for(int i=0;i<copyLongArr.length;i++){
	System.out.println(copyLongArr[i]);
	}
	for(int i=0;i<copyDoubleArr.length;i++){
	System.out.println(copyDoubleArr[i]);
	}
	for(int i=0;i<copyStringArr.length;i++){
	System.out.println(copyStringArr[i]);
	}
	for(int i=0;i<copyBoolArr.length;i++){
	System.out.println(copyBoolArr[i]);
	}
	for(int i=0;i<copyShortArr.length;i++){
	System.out.println(copyShortArr[i]);
	}
	for(int i=0;i<copyCharArr.length;i++){
	System.out.println(copyCharArr[i]);
	}
	for(int i=0;i<copyByteArr.length;i++){
	System.out.println(copyByteArr[i]);
	}

	}
}