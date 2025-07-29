class Medical{

private long id;
char grade;

public Medical(long id,char grade){
	this.id=id;
	this.grade=grade;
}

public void setId(long a){
	this.id=a;
}

public long getId(){
	return id;
}
public void setGrade(char b){
	 grade=b;
}

public char getGrade(){
	return grade;
}
}