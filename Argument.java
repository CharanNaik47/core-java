class Argument{

public static void main(String[] args){

System.out.println("Printing Argument");
System.out.println(args.length);

for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}

//System.out.println(args[0]);
//System.out.println(args[1]);

String a=args[0];
String b=args[1];
System.out.println(a+b);
}
}