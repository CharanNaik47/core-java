class Emp{

private String name;
int no;
private float salary;
char grade;
long mNo;

 private static String cname;
 static int cmembers;
 
//1st
public void sDetail1(String a){
	name=a;
}
public String getDetailA(){
	return name;
}
//2nd
public void sDetail2(int b){
	no=b;
}
//3rd
public void sDetail3(float c){
	salary=c;
}
public float getDetailB(){
	return salary;
}
//4th
public void sDetail4(char d){
	grade=d;
}
//5th
public void sDetail5(long e){
	mNo=e;
}
//static
//6th
public static void tDetail1(String f){
	cname=f;
}
public String getDetailC(){
	return cname;
}
public static void tDetial2(int g){
	cmembers=g;
}
}