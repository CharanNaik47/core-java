class ZeroMove{

public static void main(String[] args){

int arr[]={0,2,0,3,4};
int num=0;

for(int i=0;i<arr.length-1;i++){
	for(int j=i+1;j<arr.length;j++){
	if(arr[i]<=num){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}