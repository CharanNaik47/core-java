class FindArrayNumber{

public static void main(String[] args){
	
	int array[]={10,34,45,67,12,89};
	
	for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
	}
	
	int num=12;
	
	for(int i=0;i<array.length;i++){
		if(array[i]==num){
			System.out.println("Element found "+num+" at index = "+i);
		}
	}
}
}		