class Fibonacci{

public static void main(String[] args){

int a=0;
int b=1;
int c=0;

for(int i=0;i<10;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}

//While Loop
System.out.println("Using While Loop");

a=0;
b=1;
c=0;

int j=0;
while(j<10){
c=a+b;
System.out.println(c);

a=b;
b=c;
j++;
}
}
}