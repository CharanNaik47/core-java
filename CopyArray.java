class CopyArray{

public static void main(String[] args){

int age[]=new int[4];
for(int i=0;i<age.length;i++){

age[i]=i+(20*i);
}

System.out.println("Before copy");

for(int i=0;i<age.length;i++){
System.out.println(age[i]);
}

System.out.println("After copy");

	int copyArray[]= new int[age.length];
	
	for(int i=0;i<age.length;i++){
	copyArray[i]=age[i];
	}
	for(int i=0;i<copyArray.length;i++){
	System.out.println(copyArray[i]);
	}
}
}	