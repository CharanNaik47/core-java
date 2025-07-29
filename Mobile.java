class Mobile{
 
 String name;
 int mNo;
 String model;
 float price;
 int ram;
 
 public Mobile(){
 }
  public void setN(String x1,int x2,String x3,float x4,int x5){
	 name=x1;
	 mNo=x2;
	 model=x3;
	 price=x4;
	 ram=x5;
 }
 
 public void setM(String y1,int y2,String y3,float y4,int y5){
	 name=y1;
	 mNo=y2;
	 model=y3;
	 price=y4;
	 ram=y5;
 }
 
 public void setO(String z1,int z2,String z3,float z4,int z5){
	 name=z1;
	 mNo=z2;
	 model=z3;
	 price=z4;
	 ram=z5;
 }
 
 public void setP(String u1,int u2,String u3,float u4,int u5){
	 name=u1;
	 mNo=u2;
	 model=u3;
	 price=u4;
	 ram=u5;
 }
 
 public static void main(String[] args){
	 Mobile mob1=new Mobile();
	  mob1.name="Real Me";
	  System.out.println(mob1.name);
	  mob1.mNo=125;
	  System.out.println(mob1.mNo);
	  mob1.model="P2 Pro";
	  System.out.println(mob1.model);
	  mob1.price=27.000f;
	  System.out.println(mob1.price);
	  mob1.ram=12;
	  System.out.println(mob1.ram);
	  
	  //1st

      mob1.setName("OPPO");
	  mob1.setmNo(175);
	  mob1.setModel("A 5s");
	  mob1.setPrice(12.000f);
	  mob1.setRAM(4);
 
 System.out.println(mob1.name);
 System.out.println(mob1.mNo);
 System.out.println(mob1.model);
 System.out.println(mob1.price);
 System.out.println(mob1.ram);
 
 // 2nd
 
      Mobile mob2=new Mobile();
      mob2.setN("vivo",765,"v3",20.000f,8);
 
 System.out.println(mob2.name);
 System.out.println(mob2.mNo);
 System.out.println(mob2.model);
 System.out.println(mob2.price);
 System.out.println(mob2.ram);
 
 //3rd
 
 Mobile mob3=new Mobile();
      mob3.setM("RED ME",265,"note 6 pro",12.000f,4);
	  
 
 System.out.println(mob3.name);
 System.out.println(mob3.mNo);
 System.out.println(mob3.model);
 System.out.println(mob3.price);
 System.out.println(mob3.ram);
 
 //4th
 
 Mobile mob4=new Mobile();
      mob4.setO("Nokia",432,"h2",1.000f,1);
	  
 
 System.out.println(mob4.name);
 System.out.println(mob4.mNo);
 System.out.println(mob4.model);
 System.out.println(mob4.price);
 System.out.println(mob4.ram);
 
 //5th
 
 Mobile mob5=new Mobile();
      mob5.setP("samsang",605,"galaxy J2",15.000f,8);
	  
 
 System.out.println(mob5.name);
 System.out.println(mob5.mNo);
 System.out.println(mob5.model);
 System.out.println(mob5.price);
 System.out.println(mob5.ram);
 }
 
 public void setName(String a){
	 name=a;
 }
  public void setmNo(int b){
	 mNo=b;
 }
  public void setModel(String c){
	 model=c;
 }
  public void setPrice(float d){
	 price=d;
 }
  public void setRAM(int e){
	 ram=e;
 }
}