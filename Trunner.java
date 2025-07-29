class Trunner{

public static void main(String[] args){
	
	Traveller t1=new Traveller();
	t1.tDetail1("Sugam");
	System.out.println(t1.getDetailA());
	
	Traveller t2=new Traveller();
	t2.tDetail2(1200); 
    System.out.println(t2.no);
	
    Traveller t3=new Traveller();
	t1.tDetail3(1.500f);
	System.out.println(t3.getDetailB());
	
    Traveller t4=new Traveller();
	t4.tDetail4("RED");
	System.out.println(t4.color);
	
	Traveller t5=new Traveller();
	t5.tDetail5(250);
	System.out.println(t5.km);
	
	Traveller d1=new Traveller();
	d1.dDetail1("Prasant");
	System.out.println(d1.getDetailC());
	
	Traveller d2=new Traveller();
    d2.dDetial2(26);
	System.out.println(d2.dage);
}
}