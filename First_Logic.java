class First_Logic{

public static void main(String[] args){

int[] threeMultiply= new int[10];

for(int i=0;i<threeMultiply.length;i++){
	threeMultiply[i]=3*(i+1);
}
for(int i=1;i<=threeMultiply.length;i++){
	threeMultiply[i-1]=3*i;
	System.out.println(threeMultiply[i-1]);
}
for(int i=0;i<threeMultiply.length;i++){
	System.out.println(threeMultiply[i]);
}
for(int i=0;i<threeMultiply.length;i++){
System.out.println(threeMultiply[i-1]);
}
}
}