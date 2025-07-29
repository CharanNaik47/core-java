class Xerox{

int pages;
boolean print;

public Xerox(int pages,boolean print){
	this.pages=pages;
	this.print=print;
}

public void setPage(int x){
	this.pages=x;
}

public int getPage(){
	return pages;
}

public void setPrint(boolean y){
	this.print=y;
}
public boolean getPrint(){
	return print;
}
}