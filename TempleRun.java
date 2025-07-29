class TempleRun{

public static void main(String[] args){
	
	 Temple t1=new  Temple();
	t1.tDetail1("Shiva");
	System.out.println(t1.getDetailA());
	
	 Temple c2=new  Temple();
	c2.tDetail2(78); 
    System.out.println(c2.no);
	
     Temple c3=new  Temple();
	c3.tDetail3("Gokarna");
	System.out.println(c3.getDetailB());
	
     Temple t4=new  Temple();
	t4.tDetail4("Blue");
	System.out.println(t4.state);
	
	 Temple t5=new  Temple();
	t5.tDetail5(1506350055464L);
	System.out.println(t5.income);
	
	 Temple tt1=new  Temple();
	tt1.ttDetail1("KWT");
	System.out.println(tt1.getDetailC());
	
	 Temple tt2=new  Temple();
    tt2.ttDetial2(20);
	System.out.println(tt2.tid);
}
}