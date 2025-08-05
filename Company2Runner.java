class Company2Runner{

public static void main(String[] args){
	
	Company2 company=new Company2("Infosys",24617,"Bangalore",596);
	
	System.out.println(company.getName());
	System.out.println(company.getId());
	System.out.println(company.getCity());
	System.out.println(company.getEmployees());
}
}