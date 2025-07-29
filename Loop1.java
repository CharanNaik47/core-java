class Loop1{
	
	 static int n=100;
	 
	 public static void main(String[] args){
		  for(int i=0;i<=n;i++){
			  if(i%2==0){
				  System.out.println("Even numbers= "+i);
			  	  
		  }
		  if(i%2!=0){
		  System.out.println("Odd numbers= "+i);
		 }
		 if(i%3==0){
		  System.out.println("Divisible 3 = "+i);
		 }
		 if(i%5==0){
		  System.out.println("Divisible 5 = "+i);  		  
		 }
		 System.out.println(" ");
		  }
		  }
	 }