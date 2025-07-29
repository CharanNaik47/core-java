class Greatest{
	
	public static void main(String[] args){
		
int[] num={7,10,0,9,3};
//int great=largeNumber(num);
//System.out.println("Greatest" +great);



//public static int[] largeNumber(int[] max){
	int max = num[0];
for(int i=1;i<num.length;i++){
	if (num[i]>max){
		max=num[i];
	}
}	
System.out.println("Greatest" +max);
	//return max;
	} 
	}