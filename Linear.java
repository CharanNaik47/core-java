import java.util.Scanner;

class Linear{

public static void main(String[] args){
int[] number={2,4,6,8,5};

Scanner sc=new Scanner(System.in);
System.out.println("Number x= ");
int x=sc.nextInt();

for(int i=0;i<number.length;i++){
	if(number[i]==x){
System.out.println("Number= "+i);
}
}
}
}	