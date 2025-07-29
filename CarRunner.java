class CarRunner{

public static void main(String[] args){
	
	 Cars c1=new  Cars();
	c1.cDetail1("Satish");
	System.out.println(c1.getDetailA());
	
	 Cars c2=new  Cars();
	c2.cDetail2(78); 
    System.out.println(c2.no);
	
     Cars c3=new  Cars();
	c3.cDetail3(30.40678f);
	System.out.println(c3.getDetailB());
	
     Cars c4=new  Cars();
	c4.cDetail4("Blue");
	System.out.println(c4.color);
	
	 Cars c5=new  Cars();
	c5.cDetail5(15);
	System.out.println(c5.mailage);
	
	 Cars b1=new  Cars();
	b1.bDetail1("Naman");
	System.out.println(b1.getDetailC());
	
	 Cars b2=new  Cars();
    b2.bDetial2(20);
	System.out.println(b2.bage);
}
}