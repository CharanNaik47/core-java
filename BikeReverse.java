class BikeReverse{

 public static void main(String[] args){
 
 Bike bike1=new Bike();
 bike1.bName("KTM");
 System.out.println(bike1.getName());
 
 Bike bike2=new Bike();
 bike2.bid(147);
 System.out.println(bike2.id);
 
 Bike bike3=new Bike();
 bike3.bMailage(30);
 System.out.println(bike3.getMailage());
 
 Bike bike4=new Bike();
 bike4.bPrice(4.00000f);
 System.out.println(bike4.price);
 
 Bike bike5=new Bike();
 //Bike.setName("Mithun");
 System.out.println(Bike.oName);
 
 Bike bike6=new Bike();
 bike6.bName("Hero");
 System.out.println(bike6.getName());
 
 Bike bike7=new Bike();
 bike7.bid(587);
 System.out.println(bike7.id);
 
 Bike bike8=new Bike();
 bike8.bMailage(50);
 System.out.println(bike8.getMailage());
 
 Bike bike9=new Bike();
 bike9.bPrice(5.00000f);
 System.out.println(bike9.price);
 
 Bike bike10=new Bike();
 //Bike.setName("Suhan");
 System.out.println(Bike.oName);
 }
}