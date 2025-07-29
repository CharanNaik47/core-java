class Traveller{

private String name;
int no;
private float price;
String color;
int km;

 private static String dname;
 static int dage;
 
//1st
public void tDetail1(String a){
	name=a;
}
public String getDetailA(){
	return name;
}
//2nd
public void tDetail2(int b){
	no=b;
}
//3rd
public void tDetail3(float c){
	price=c;
}
public float getDetailB(){
	return price;
}
//4th
public void tDetail4(String d){
	color=d;
}
//5th
public void tDetail5(int e){
	km=e;
}
//static
//6th
public static void dDetail1(String f){
	dname=f;
}
public String getDetailC(){
	return dname;
}
public static void dDetial2(int g){
	dage=g;
}
}