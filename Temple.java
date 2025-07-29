class Temple{

private String name;
int no;
private String adrs;
String state;
long income;

 private static String tname;
 static int tid;
 
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
public void tDetail3(String c){
	adrs=c;
}
public String getDetailB(){
	return adrs;
}
//4th
public void tDetail4(String d){
	state=d;
}
//5th
public void tDetail5(long e){
	income=e;
}
//static
//6th
public static void ttDetail1(String f){
	tname=f;
}
public String getDetailC(){
	return tname;
}
public static void ttDetial2(int g){
	tid=g;
}
}