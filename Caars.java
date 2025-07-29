class Caars{
 private String name;
 int id;
 private int mailage;
 float price;
 
 public static String oName;
 
 static {
	 oName="Mani";
 }
 
 public void cName(String x){
	 name=x;
 }
 public String getName(){
	 return name;
 }
 public void cid(int y){
	 id=y;
 }
 public void cMailage(int z){
	 mailage=z;
 }
 public int getMailage(){
	 return mailage;
 }
 public void cPrice(float u){
	 price=u;
 }
 /*public static void setName(String e){
	 oName=e;
 }*/
}