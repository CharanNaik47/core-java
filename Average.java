class Average{

public static void main(String[] args){

int[] numbers={10,20,30,40,50};          //array declare
//averageOfArrayNumbers();

float average= averageOfArray(numbers);
System.out.println(average);
}


public static float averageOfArray(int[] numbers){

  int sum=0;
    for (int i=0;i<numbers.length;i++){
        sum=sum+numbers[i];
}

   System.out.println(sum);
   float average=sum/numbers.length;
   return average;
}
}