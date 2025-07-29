class ClgRunner{

public static void main(String[] args){
	
	Clg t1=new Clg();
	t1.sDetail1("Sugam");
	System.out.println(t1.getDetailA());
	
	Clg t2=new Clg();
	t2.sDetail2(19); 
    System.out.println(t2.no);
	
    Clg t3=new Clg();
	t1.sDetail3(9.6f);
	System.out.println(t3.getDetailB());
	
    Clg t4=new Clg();
	t4.sDetail4('A');
	System.out.println(t4.grade);
	
	Clg t5=new Clg();
	t5.sDetail5(8277519575L);
	System.out.println(t5.mNo);
	
	Clg d1=new Clg();
	d1.tDetail1("Prasant");
	System.out.println(d1.getDetailC());
	
	Clg d2=new Clg();
    d2.tDetial2(26000);
	System.out.println(d2.tsalary);
}
}