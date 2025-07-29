class Laaptop{
 
 String name;
 int mNo;
 String model;
 float price;
 int ram;
 
 
 public void setP(String u1,int u2,String u3,float u4,int u5){
	 name=u1;
	 mNo=u2;
	 model=u3;
	 price=u4;
	 ram=u5;
 }
 
 public void setQ(String v1,int v2,String v3,float v4,int v5){
	 name=v1;
	 mNo=v2;
	 model=v3;
	 price=v4;
	 ram=v5;
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
 
  public static void main(String[] args){
	
	  //1st

       Laaptop lap1=new Laaptop();
      lap1.setP("vivo",765,"v3",45.000f,8);
 
 System.out.println(lap1.name);
 System.out.println(lap1.mNo);
 System.out.println(lap1.model);
 System.out.println(lap1.price);
 System.out.println(lap1.ram);
 
 // 2nd
 
      Laaptop lap2=new Laaptop();
      lap2.setQ("ASUS",765,"Vivobook",50.000f,8);
 
 System.out.println(lap2.name);
 System.out.println(lap2.mNo);
 System.out.println(lap2.model);
 System.out.println(lap2.price);
 System.out.println(lap2.ram);
 
 //3rd
 
 Laaptop lap3=new Laaptop();
      lap3.setM("Dell",265,"note 6 pro",12.000f,4);
	  
 
 System.out.println(lap3.name);
 System.out.println(lap3.mNo);
 System.out.println(lap3.model);
 System.out.println(lap3.price);
 System.out.println(lap3.ram);
 
 //4th
 
 Laaptop lap4=new Laaptop();
      lap4.setN("HP",432,"h2",1.000f,1);
	  
 
 System.out.println(lap4.name);
 System.out.println(lap4.mNo);
 System.out.println(lap4.model);
 System.out.println(lap4.price);
 System.out.println(lap4.ram);
 
 //5th
 
 Laaptop lap5=new Laaptop();
      lap5.setO("samsang",605,"galaxy J2",15.000f,8);
	  
 
 System.out.println(lap5.name);
 System.out.println(lap5.mNo);
 System.out.println(lap5.model);
 System.out.println(lap5.price);
 System.out.println(lap5.ram);
 }
}