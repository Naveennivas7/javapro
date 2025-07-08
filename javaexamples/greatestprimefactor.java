package javaexamples;

public class greatestprimefactor {
public static int isPrime(int num) {
    int c=0;
    for(int i=2;i<num; i++) {
        if(num%i==0) {
            c=1;
            break;
}}
if(c==0) {
    return num;}
    
return 0;
}
public static void main(String[] args) {
        int a = 55;
        int k=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                  if(isPrime(i)>k){
                    k=isPrime(i);}
        }}
    System.out.println(k);}
                
    }