import java.util.Scanner;

class Star{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for (int i=1;i<=n;i++){
	for(int j=1; j<=n;j++){
		if (i==1||i==3||i==n||j==2||j==n||j==3){
	System.out.print("*");
	}
	else{
	System.out.print(" ");
	}}
	System.out.println();
	}
}
}


