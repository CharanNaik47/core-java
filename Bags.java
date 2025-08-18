class Bags{ 

private String name;
private int id;
private float price;
private char grade;
private int warranty;

public Bags(){
}

public Bags(String name,int id){
	this.name=name;
	this.id=id;
}
public Bags(String name,int id,float price){
	this.name=name;
	this.id=id;
	this.price=price;
}

public Bags(String name,int id,float price,char grade){
	this.name=name;
	this.id=id;
	this.price=price;
	this.grade=grade;
}

public Bags(String name,int id,float price,char grade,int warranty){
	this.name=name;
	this.id=id;
	this.price=price;
	this.grade=grade;
	this.warranty=warranty;
}

public String getname(){
	return name;
}

public int getId(){
	return id;
}

public float getPrice(){
	return price;
}

public char getGrade(){
	return grade;
}

public int getWarranty(){
	return warranty;
}
}