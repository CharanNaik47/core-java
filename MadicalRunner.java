class MadicalRunner{

public static void main(String[] args){
	
	Medical medical=new Medical(96371837729L,'A');
	
	System.out.println(medical.getId());
	System.out.println(medical.grade);
	
	Medical medical1=new Medical(9764376767L,'C');
	System.out.println(medical1.getId());
	System.out.println(medical1.grade);
}
}