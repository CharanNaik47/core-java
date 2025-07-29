class OilArrayRunner{

public static void main(String[] args){

Oil[] oil=new Oil[5];

Oil oil1=new Oil();
oil1.setName("Induleka");
oil1.setGrade('A');

oil[0]=oil1;

Oil oil2=new Oil();
oil2.setName("Parachute");
oil2.setGrade('A');

oil[1]=oil2;

Oil oil3=new Oil();
oil3.setName("Navaratna");
oil3.setGrade('C');

oil[2]=oil3;

Oil oil4=new Oil();
oil4.setName("Patanjali");
oil4.setGrade('B');

oil[3]=oil4;

Oil oil5=new Oil();
oil5.setName("Shri Marikamba");
oil5.setGrade('A');

oil[4]=oil5;

for(int i=0;i<oil.length;i++){
	
	Oil someOil=oil[i];
	System.out.println(someOil.getName());
	System.out.println(someOil.getGrade());
}
}
}