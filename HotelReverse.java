class HotelReverse{

 public static void main(String[] args){
 
 Hotel hotel1=new Hotel();
 hotel1.hName("Halli Mane");
 System.out.println(hotel1.getName());
 
 Hotel hotel2=new Hotel();
 hotel2.hid(147);
 System.out.println(hotel2.id);
 
 Hotel hotel3=new Hotel();
 hotel3.hMember(30);
 System.out.println(hotel3.getMember());
 
 Hotel hotel4=new Hotel();
 hotel4.hPrice(4.00000f);
 System.out.println(hotel4.price);
 
 Hotel hotel5=new Hotel();
 //Hotel.setName("Mithun");
 System.out.println(Hotel.oName);
 
 }
}