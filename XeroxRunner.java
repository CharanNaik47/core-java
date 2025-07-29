class XeroxRunner{

public static void main(String[] args){
	
	Xerox xerox=new Xerox(38,true);
		
		System.out.println(xerox.pages);
	    System.out.println(xerox.print);
		xerox.setPrint(false);
		System.out.println(xerox.getPrint());
		
		Xerox xerox1=new Xerox(10,true);
		System.out.println("....................");
	    System.out.println("it's=" +xerox1.print);
		System.out.println(xerox1.pages);
	}
}