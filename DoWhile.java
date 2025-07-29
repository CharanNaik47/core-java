import java.util.*;
class DoWhile{
	
	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
	    int NoOf_Student=3;
		
	int i=1;
	do{
		i++;
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
	}while(i<=NoOf_Student);
    }
} 