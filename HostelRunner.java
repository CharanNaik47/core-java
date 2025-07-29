class HostelRunner{

 public static void main(String[] args){
 
 Hostel hostel1=new Hostel();
 hostel1.hName("Halli Mane");
 System.out.println(hostel1.getName());
 
 Hostel hostel2=new Hostel();
 hostel2.hid(147);
 System.out.println(hostel2.id);
 
 Hostel hostel3=new Hostel();
 hostel3.hMember(30);
 System.out.println(hostel3.getMember());
 
 Hostel hostel4=new Hostel();
 hostel4.hPrice(4.00000f);
 System.out.println(hostel4.price);
 
 Hostel hostel5=new Hostel();
 //Hostel.setName("Mithun");
 System.out.println(Hostel.oName);
 
 }
}