import java.util.Scanner;

class Printing{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.print("How much star= ");
int n=sc.nextInt();

for (int i=1;i<=n;i++){
	for(int j=1; j<=i;j++){
		//if (i==1||i==n||j==2){
	System.out.print("*");
	}
	System.out.println();
	
	/*else{
	System.out.print(" ");
	}}
	System.out.println();*/
	}
}
}
