class Employ{
 
 String name;
 int rNo;
 String adrs;
 float salary;
 char bg;
 
 
 public void setP(String u1,int u2,String u3,float u4,char u5){
	 name=u1;
	 rNo=u2;
	 adrs=u3;
	 salary=u4;
	 bg=u5;
 }
 
 public void setQ(String v1,int v2,String v3,float v4,char v5){
	name=v1;
	 rNo=v2;
	 adrs=v3;
	 salary=v4;
	 bg=v5;
 }
  public void setN(String x1,int x2,String x3,float x4,char x5){
	 name=x1;
	 rNo=x2;
	 adrs=x3;
	 salary=x4;
	 bg=x5;
 }
 
 public void setM(String y1,int y2,String y3,float y4,char y5){
	 name=y1;
	 rNo=y2;
	 adrs=y3;
	 salary=y4;
	 bg=y5;
 }
 
 public void setO(String z1,int z2,String z3,float z4,char z5){
	 name=z1;
	 rNo=z2;
	 adrs=z3;
	 salary=z4;
	 bg=z5;
 }
 
  public static void main(String[] args){
	
	  //1st

       Employ sl1=new Employ();
      sl1.setP("Ganesh",765,"Sirsi",78.900f,'A');
 
 System.out.println(sl1.name);
 System.out.println(sl1.rNo);
 System.out.println(sl1.adrs);
 System.out.println(sl1.salary);
 System.out.println(sl1.bg);
 
 // 2nd
 
      Employ sl2=new Employ();
      sl2.setQ("Sanket",765,"Bhatkal",99.300f,'A');
 
 System.out.println(sl2.name);
 System.out.println(sl2.rNo);
 System.out.println(sl2.adrs);
 System.out.println(sl2.salary);
 System.out.println(sl2.bg);
 
 //3rd
 
 Employ sl3=new Employ();
      sl3.setM("Karunya",265,"Kumata",95.400f,'B');
	  
 
 System.out.println(sl3.name);
 System.out.println(sl3.rNo);
 System.out.println(sl3.adrs);
 System.out.println(sl3.salary);
 System.out.println(sl3.bg);
 
 //4th
 
Employ sl4=new Employ();
      sl4.setN("Rajesh",432,"Ankola",65.200f,'O');
	  
 
 System.out.println(sl4.name);
 System.out.println(sl4.rNo);
 System.out.println(sl4.adrs);
 System.out.println(sl4.salary);
 System.out.println(sl4.bg);
 
 //5th
 
 Employ sl5=new Employ();
      sl5.setO("Latha",605,"Karwar",89.900f,'A');
	  
 
 System.out.println(sl5.name);
 System.out.println(sl5.rNo);
 System.out.println(sl5.adrs);
 System.out.println(sl5.salary);
 System.out.println(sl5.bg);
 }
}