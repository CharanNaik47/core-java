class Bike{
 private String name;
 int id;
 private int mailage;
 float price;
 
 public static String oName;
 
 static {
	 oName="Raj";
 }
 
 public void bName(String a){
	 name=a;
 }
 public String getName(){
	 return name;
 }
 public void bid(int b){
	 id=b;
 }
 public void bMailage(int c){
	 mailage=c;
 }
 public int getMailage(){
	 return mailage;
 }
 public void bPrice(float d){
	 price=d;
 }
 /*public static void setName(String e){
	 oName=e;
 }*/
}