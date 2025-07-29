class Train{
 private String name;
 private int cost;
 private int speed;
 
 public static int length;      //static
  static {
  System.out.println("static block in train");
  length=100;
  }
  //non-static
  {
	  System.out.println("Non-static block in train");
	  length=200;
  }
                                    //name
  public void setName(String n){
	  name=n;
  }
  public String getName(){
	  return name;
  }
                                   //cost
  public void setCost(int m){
	  cost=m;
  }
  public int getCost(){
	  return cost;
  }
}
