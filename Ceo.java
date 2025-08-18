class Ceo{

private String name;
private float salary;
private String city;

public Ceo(){
}

public Ceo(String name,float salary){
	this.name=name;
	this.salary=salary;
}

public Ceo(String name, float salary,String city){
	this(name,salary);
	this.city=city;
}

public String getName(){
	return name;
}
public float getSalary(){
	return salary;
}
public String getCity(){
	return city;
}
}