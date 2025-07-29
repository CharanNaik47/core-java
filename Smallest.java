class Smallest{
	
	public static void main(String[] args){
		
int[] num={7,10,0,9,3};
int great=smallNumber(num);
System.out.println("Smallest:" +great);
	}

public static int smallNumber(int[] num){
	int min = num[0];
    for(int i=1;i<num.length;i++){
	if (num[i]<min){
		min=num[i];
	}
}	
    return min;                                          //System.out.println("smallest" +min);
	
	}	
}