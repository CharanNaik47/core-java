public class program1{
	public static void main(String[] args){
		int num=7,count=0;
		
		for(int i=1;i<=num;i++){
			if(num % i==0)
				count++;
		}
		if(count==2){
			System.out.println(num+ " is prime");
		}
		else{
			System.out.println(num+ " is not prime");
		}
	}
}