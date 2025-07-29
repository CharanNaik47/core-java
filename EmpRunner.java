class EmpRunner{

public static void main(String[] args){
	
	Emp t1=new Emp();
	t1.sDetail1("Naveen");
	System.out.println(t1.getDetailA());
	
	Emp t2=new Emp();
	t2.sDetail2(145); 
    System.out.println(t2.no);
	
    Emp t3=new Emp();
	t1.sDetail3(19.746f);
	System.out.println(t3.getDetailB());
	
    Emp t4=new Emp();
	t4.sDetail4('B');
	System.out.println(t4.grade);
	
	Emp t5=new Emp();
	t5.sDetail5(8267451975L);
	System.out.println(t5.mNo);
	
	Emp d1=new Emp();
	d1.tDetail1("Averixis");
	System.out.println(d1.getDetailC());
	
	Emp d2=new Emp();
    d2.tDetial2(2709);
	System.out.println(d2.cmembers);
}
}