import java.util.Scanner;

class PowerOfDigit{

public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=sc.nextInt();   //153
	
	int temp=num;
	int length=String.valueOf(num).length();
	int sum=0;
	
	while(temp>0){                           //153>0 T
		int reminder=temp%10;                // 153%10=3
		sum +=Math.pow(reminder,length);      // sum=27+
		temp/=10;                            //15
	}
	System.out.println("Power of digit = "+sum);
}
}