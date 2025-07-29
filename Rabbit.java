class Rabbit{
 
 String name;
 private float kg;
 
 public Rabbit(String name,float kg){
	 this.name=name;
	 this.kg=kg;
 }
 
 
 public void setRabbit(String a,Float b){
	 this.name=a;
	 this.kg=b;
 }
 public String getName(){
	 return name;
 }
 public float getKg(){
	 return kg;
 }
}