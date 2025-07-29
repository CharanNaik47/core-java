class CatRunner{

public static void main(String[] args){
	
	Cat cat1=new Cat("Bujji",2);
	System.out.println(cat1.name);
	System.out.println(cat1.getAge());
	
	Cat cat2=new Cat("Bujji",1);
	//cat2.setAge(1);
	System.out.println(cat2.getAge());
}
}