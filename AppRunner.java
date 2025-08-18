class AppRunner{

public static void main(String[] args){

App app1=new App("WhatsApp",2456,347f,"Chat",5.6d);

System.out.println(app1.getName());
System.out.println(app1.getId());
System.out.println(app1.getData());
System.out.println(app1.getWork());
System.out.println(app1.getVersion());
System.out.println();

App app2=new App("Instagram",5176,462f,"Chat & reels",5.6d);

System.out.println(app2.getName());
System.out.println(app2.getId());
System.out.println(app2.getData());
System.out.println(app2.getWork());
System.out.println(app2.getVersion());
System.out.println();

App app3=new App("PhonePe",1656,847f,"Paying",2.7d);

System.out.println(app3.getName());
System.out.println(app3.getId());
System.out.println(app3.getData());
System.out.println(app3.getWork());
System.out.println(app3.getVersion());
System.out.println();

App app4=new App("FreeFire",9406,527f,"Gaming",2.6d);

System.out.println(app4.getName());
System.out.println(app4.getId());
System.out.println(app4.getData());
System.out.println(app4.getWork());
System.out.println(app4.getVersion());
System.out.println();

App app5=new App("BlinkIt",1556,197f,"shoping",1.6d);

System.out.println(app5.getName());
System.out.println(app5.getId());
System.out.println(app5.getData());
System.out.println(app5.getWork());
System.out.println(app5.getVersion());
System.out.println();
}
}