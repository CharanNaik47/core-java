 class ArrayUse{
 
 public static void main(String[] args){
	 
	 String[] name={"Mantan","Sanath","Akash"};
	 
     System.out.println(name.length);                         //1  Lenght
	 
     System.out.println(name[0]);                             //2  one by one
	 System.out.println(name[1]);
	 
	 
	 for(int i=0;i<name.length;i++){                           //loop use one by one
	 System.out.println("Names:  "+name[i]);
	 }
	 
	 int[] number={10,5,30,40,50};
	 for(int i=0; i<number.length;i++){
	 System.out.println(number[i]);
	 }
 }
 }