class FourMultiply{

public static void main(String[] args){

int[] num=new int[10];
int number=4;

for(int i=0;i<num.length;i++){
	num[i]= number * (i+1);
	System.out.println(num[i]);
}
for(int i=1;i<num.length;i++){
	num[i-1]=number * i;
	System.out.println(num[i-1]);
}
}
}