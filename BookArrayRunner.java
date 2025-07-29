class BookArrayRunner{

public static void main(String[] args){

BookArray[] book=new BookArray[5];

BookArray book1=new BookArray();
book1.setName("Kindar jogi");
book1.setPrice(2400);

book[0]=book1;

BookArray book2=new BookArray();
book2.setName("Aashram");
book2.setPrice(5300);

book[1]=book2;

BookArray book3=new BookArray();
book3.setName("Ratan");
book3.setPrice(9500);

book[2]=book3;

BookArray book4=new BookArray();
book4.setName("Bhagath");
book4.setPrice(6700);

book[3]=book4;

BookArray book5=new BookArray();
book5.setName("Soul");
book5.setPrice(1500);

book[4]=book5;

for(int i=0;i<book.length;i++){
	
	BookArray allBook= book[i];
	
	System.out.println(allBook.getName());
	System.out.println(allBook.getPrice());
}
}
}