class BookRunner{
	
  
  public static void main(String[] args){
	  
	  Book1 b1=new Book1();
	  b1.setName("java");
	  System.out.println(b1.getName());
	  
	  Book1.setNO(12);
	  System.out.println(Book1.sNo);
	  
	  b1.setPrice(23.7f);
	  System.out.println(b1.getPrice());
  }	 

  }