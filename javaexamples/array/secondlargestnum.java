package javaexamples.array;

public class secondlargestnum {
    public static void main(String[] args) {
        int[] numbers={28,82,94,78,10,54};
        int max=numbers[0];
        int secondmax=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                secondmax=max;
                max=numbers[i];
            }
            else if(numbers[i]>secondmax && numbers[i]!=max){
                secondmax=numbers[i];
            }
            }
            System.out.println("second largest number is "+secondmax);
        }
    
}
