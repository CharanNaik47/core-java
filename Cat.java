class Cat{

String name;
private int age;

public Cat(String name,int age){
	System.out.println("Parameterized Constructer");
	this.name=name;
	this.age=age;
}

public void setName(String name){
	this.name=name;
}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}