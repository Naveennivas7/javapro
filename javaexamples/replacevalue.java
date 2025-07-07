package javaexamples;

public class replacevalue {
    public static void main(String[] args) {
        int n = 12345;
        int temp = n;
        int pv = 1;
        
        while(temp!=0){
         pv=pv*10;
            temp=temp/10;

            
        }pv=pv/10;
        while(pv!=0){
            int d =(n/pv)%10;
            System.out.print(9-d);
            pv=pv/10;
        }
    
}}
