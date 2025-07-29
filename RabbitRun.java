class RabbitRun{

public static void main(String[] args){

Rabbit rabbit=new Rabbit("Bulli",2.5f);

   System.out.println(rabbit.name);
   System.out.println(rabbit.getKg());
   rabbit.setRabbit("Munna",1.0f);
   System.out.println(rabbit.getName());
   //System.out.println(rabbit.getKg());
}
}