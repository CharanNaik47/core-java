class Checkm{
 
 public static void main(String[] args){
   int num[]={2,4,7,8};
   boolean value=true;
   
   for( int i=0;i<num.length;i++){
	   if (num[i]%2!=0){
		   value=false;
		   break;
		   //this wrong System.out.println("This number is "+ value);
	   }
   }
   System.out.println("This number is "+ value);
 }
}