class RiverRunner{

public static void main(String[] args){

River river=new River("Kali",100);

System.out.println("River name= "+river.name);
river.setRiver("agnga",100);
System.out.println(river.getName());
System.out.println("River width= "+river.getWidth());
}
}
