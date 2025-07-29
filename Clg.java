class Clg{

private String name;
int no;
private float cgpa;
char grade;
long mNo;

 private static String tname;
 static int tsalary;
 
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
	cgpa=c;
}
public float getDetailB(){
	return cgpa;
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
	tname=f;
}
public String getDetailC(){
	return tname;
}
public static void tDetial2(int g){
	tsalary=g;
}
}