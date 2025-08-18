class MissingNumber{

public static void main(String[] args){

int[] num={1,2,4,5};
boolean found=false;

for(int i=1;i<=num.length;i++){
	for(int j=0;j<num.length;j++){
		if(i==num[j]){
			found=true;
			break;
		}
	}
	//found=false;
	if(!found){
		
		System.out.println("Missing number= "+i);
		}
		found=false;
}
}
}