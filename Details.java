 import java.util.Scanner;
  
  class Details{
  
  public static void main(String[] args){
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Student Name = ");
	  String name= sc.nextLine();
	  
	  System.out.println("Student Age = ");
	  int Age= sc.nextInt();
	  
	  System.out.println("Student Mobile number = ");
	  long M_number= sc.nextLong();
	  
	  System.out.println("Student Percentage = ");
	  float percentage= sc.nextFloat();
	  
	  sc.close();
  }
  }