class Cars{

private String name;
int no;
private float price;
String color;
int mailage;

 private static String bname;
 static int bage;
 
//1st
public void cDetail1(String a){
	name=a;
}
public String getDetailA(){
	return name;
}
//2nd
public void cDetail2(int b){
	no=b;
}
//3rd
public void cDetail3(float c){
	price=c;
}
public float getDetailB(){
	return price;
}
//4th
public void cDetail4(String d){
	color=d;
}
//5th
public void cDetail5(int e){
	mailage=e;
}
//static
//6th
public static void bDetail1(String f){
	bname=f;
}
public String getDetailC(){
	return bname;
}
public static void bDetial2(int g){
	bage=g;
}
}