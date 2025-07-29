class Hostel{
 private String name;
 int id;
 private int member;
 float price;
 
 public static String oName;
 
 static {
	 oName="Deeraj";
 }
 
 public void hName(String a){
	 name=a;
 }
 public String getName(){
	 return name;
 }
 public void hid(int b){
	 id=b;
 }
 public void hMember(int c){
	 member=c;
 }
 public int getMember(){
	 return member;
 }
 public void hPrice(float d){
	 price=d;
 }
 /*public static void setName(String e){
	 oName=e;
 }*/
}