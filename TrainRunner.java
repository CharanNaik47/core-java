class TrainRunner{

static{
	System.out.println("static block in trainRunner");
}

public static void main(String[] args){

Train train1=new Train();
train1.setName("Panchaganga");
System.out.println(train1.getName());

System.out.println(Train.length);

train1.setCost(560);
System.out.println(train1.getCost());
System.out.println("*****************************");

Train train2=new Train();
train2.setName("Matsyaghanda");
System.out.println(train2.getName());

System.out.println(Train.length);
train2.length=300;
System.out.println(train2.length);

}
}