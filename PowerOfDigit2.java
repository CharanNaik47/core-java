class PowerOfDigit2{
	
	public static void main(String[] args){
		
		int num=153;
		int quotient=num;
		int count=0;
		
		while(quotient>0){
			count=count+1;
			quotient/=10;
		};
		System.out.println("Count of digit is ="+count);
		
		int rem=0;
		int sum=0;
		while(num>0){
			rem= num % 10;
			//1 % 10=1
			int power=1;
			for(int i=0;i<count;i++){
				power=power*rem;
			}
		sum= sum + power;
		num = num / 10;
		//  1/10=0
		//  rem =num % 10
		//  15 %10
		//  sum =sum + rem ^ count
		//  num=num/10
		//  15/10=1
		}
	System.out.println("Sum is =" +sum);
	}
}