import java.util.Scanner;
class Grade{

public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
	int NoOf_Student=2;
		
	for(int i=1;i<=NoOf_Student;i++){
		int percentage= sc.nextInt();
		
		if(percentage<0 || percentage >100){
			System.out.println(percentage+" Invalid");
		}
			
		else if(percentage>=90){
			System.out.println(percentage+" Grade : A+");
		}
		else if(percentage>=80){
			System.out.println(percentage+" Grade : A");
		}
		else if(percentage>=60){
			System.out.println(percentage+" Grade : B");
		}
		else if(percentage>=35){
			System.out.println(percentage+" Grade : C");
		}
		else{
			System.out.println(percentage+" Fail");
		}
		
}}}