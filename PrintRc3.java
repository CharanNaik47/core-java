class PrintRc3{

public static void main(String[] args){
	
	int rows=4;
    int columns=8;       //5

for(int i=0;i<rows;i++){
	for(int j=1;j<columns;j++){
		if(j%2!=0)
		System.out.print(j);
		                        //System.out.print(j*2);
	}
System.out.println();
}
}
}