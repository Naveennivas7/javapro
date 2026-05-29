package javaexamples.array;

public class largestnum {
    public static void main(String[] args) {
        int[] numbers={28,82,94,78,10,54};
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
                

            }
            }
            System.out.println("largest number is "+max);
        }


    }
    

