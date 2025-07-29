class FirstLoop{
	
	 static int n=100;
	 
	 //static{
		// System.out.println("Try it");
	 //}
	 
	 public static void main(String[] args){
		 int count=0;
		  for(int i=0;i<=n;i++){
			  if(i%2==0){
				  System.out.println("Even numbers= "+i);
			  count +=i;
				  
		  }
		 }
		 System.out.println("Even numbers= "+ count);
		  }
	 }
	 // else{
			 // System.out.println(" numbers");