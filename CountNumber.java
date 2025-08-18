class CountNumber{

public static void main(String[] args){

int num=123;

int count=0;
int quotient=num;

while(quotient>0){
	                                                //quotient=num;    it's wrong because loop fix 123
	quotient=quotient/10;                             //123/10=12,      12/10=1,    1/10=0  
	count=count+1                                      // count=1           2         3
}
System.out.println(count);
}
}
3
6