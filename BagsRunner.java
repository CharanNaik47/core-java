class BagsRunner{

public static void main(String[] args){
	
	Bags bag1=new Bags("Skybags",1254,2.400f,'A',1);
	
	System.out.println(bag1.getname());
	System.out.println(bag1.getId());
	System.out.println(bag1.getPrice());
	System.out.println(bag1.getGrade());
	System.out.println(bag1.getWarranty());
	System.out.println();
	
	Bags bag2=new Bags("Wildcraft",1564,2.900f,'A',2);
	
	System.out.println(bag2.getname());
	System.out.println(bag2.getId());
	System.out.println(bag2.getPrice());
	System.out.println(bag2.getGrade());
	System.out.println(bag2.getWarranty());
	System.out.println();
	
	Bags bag3=new Bags("Wrong",3954,1.900f,'A',1);
	
	System.out.println(bag3.getname());
	System.out.println(bag3.getId());
	System.out.println(bag3.getPrice());
	System.out.println(bag3.getGrade());
	System.out.println(bag3.getWarranty());
	System.out.println();
	
	Bags bag4=new Bags("American Touristor",9752,5.400f,'A',2);
	
	System.out.println(bag4.getname());
	System.out.println(bag4.getId());
	System.out.println(bag4.getPrice());
	System.out.println(bag4.getGrade());
	System.out.println(bag4.getWarranty());
	System.out.println();
	
	Bags bag5=new Bags("Safari",3250,1.299f,'B',1);
	
	System.out.println(bag5.getname());
	System.out.println(bag5.getId());
	System.out.println(bag5.getPrice());
	System.out.println(bag5.getGrade());
	System.out.println(bag5.getWarranty());
	System.out.println();
}
}