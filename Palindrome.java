class Palindrome{
     
	 public static boolean palindrome(String word){
		 
	 /* int left=0;                                         //While loop
	    int right=word.length()-1;
	 
     while(left<right){    
		 if(word.charAt(left++)!=word.charAt(right--)){
			 return false;
	 }}
		 return true; */
		 
		 int right=word.length();                            //For loop
		 
		 for(int left=0;  left<right/2; left++){
			 if(word.charAt(left)!=word.charAt(right-1-left)){
			 return false;
			 }}
			 return true;
	 }
	 //Main Method
	 
	 public static void main(String[] args){
		 String word="madam";                   //or
		   System.out.println(word);                 //System.out.println(palindrome("madam"));
		   
		   boolean result=palindrome(word);          //Print True or False
		   System.out.println(result);
	 }
}