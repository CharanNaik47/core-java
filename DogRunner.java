class DogRunner{

public static void main(String[] args){

Dog dog=new Dog();

System.out.println(dog.name);
dog.setName("Balla");
System.out.println(dog.getName());

Dog dog1=new Dog();
System.out.println(dog1.age);
dog1.setAge(2);
System.out.println(dog1.getAge());
}
}