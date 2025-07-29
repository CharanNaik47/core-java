class CaarReverse{

 public static void main(String[] args){
 
 Caars car1=new Caars();
 car1.cName("TATA");
 System.out.println(car1.getName());
 
 Caars car2=new Caars();
 car2.cid(56);
 System.out.println(car2.id);
 
 Caars car3=new Caars();
 car3.cMailage(15);
 System.out.println(car3.getMailage());
 
 Caars car4=new Caars();
 car4.cPrice(40.00000f);
 System.out.println(car4.price);
 
 Caars car5=new Caars();
 //Bike.setName("Mithun");
 System.out.println(Caars.oName);
 
 }
}