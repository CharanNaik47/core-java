class SecondLargest1{

public static void main(String[] args){

int[] arr={10,20,40,60,50};

int largest= arr[0];
int secondLargest=arr[1];

for(int i=0;i<arr.length;i++){
    if(arr[i]>largest){
		secondLargest=largest;
		largest=arr[i];
	}
	else if(arr[i] > secondLargest && arr[i] != largest){
		secondLargest=arr[i];
	}
}
System.out.println("Largest"+largest);
System.out.println("Second Largest"+secondLargest);
}
}