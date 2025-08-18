class App{

private String name;
private int id;
private float data;
private String work;
private double version;

public App(){
}

public App(String name,int id){
	this.name=name;
	this.id=id;
}

public App(String name,int id,float data){
	this.name=name;
	this.id=id;
	this.data=data;
}

public App(String name,int id,float data,String work){
	this(name,id,data);
	this.work=work;
}

public App(String name,int id,float data,String work,double version){
	this(name,id,data,work);
	this.version=version;
}

public String getName(){
	return name;
}

public int getId(){
	return id;
}

public float getData(){
	return data;
}

public String getWork(){
	return work;
}

public double getVersion(){
	return version;
}
}
