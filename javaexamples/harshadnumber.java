package javaexamples;

public class harshadnumber {
public static void main(String[] args) {
    int n = 5; 
    int sum = 0;
    int temp = n; 
    while (n > 0) {
        int d = n % 10;
        sum += d;
        n = n / 10;
    }
    if(sum%temp== 0){
        System.out.println("harshad number");
    } else {
        System.out.println("not a harshad number");
    }
    
}}
