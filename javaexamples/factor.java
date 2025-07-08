package javaexamples;
import java.util.Scanner;

public class factor {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++){
            if(n%i==0){
               System.out.print(i+",");
            }
        } 
        System.out.print(n); 
        
        




        //count



        Scanner s=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        s.close();
        for(int i=1;i<=n;i++){
            if(a%i==0){
               count++;
            }
        } 
        System.out.print(count);  
}
}