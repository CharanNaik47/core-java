class CompanyCeoRunner{

public static void main(String[] args){
	
	Company2 company=new Company2("Infosys",24617,"Bangalore",596);
	System.out.println("Printing company details");
	System.out.println(company.getName());
	System.out.println(company.getCity());
	
	Ceo ceo=new Ceo("Vinyas",200000f,"Mangalore");
	company.setCeo(ceo);
	
	Ceo ceo1=company.getCeo();
	System.out.println("Printing company ceo details");
	System.out.println(ceo1.getName());
	System.out.println(ceo1.getCity());
	System.out.println(ceo1.getSalary());
}
}