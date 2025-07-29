class Bird{
	 
	 private String name;
	 private int age;
	 
	 public Bird(){
		 System.out.println("No argument constructor");
		 this.name="Pigeon";
	 }
	 
	 public Bird(String name,int age){
		 System.out.println("Parameterized constructor");
		 this.name=name;
		 this.age=age;
	 }
	 
	 public void setName(String name){
		 this.name=name;
	 }
	 public String getName(){
		 return name;
	 }
	 public int getAge(){
		 return age;
	 }
}