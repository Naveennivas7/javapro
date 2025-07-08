package javaexamples;

import java.util.Scanner;

public class sumoffact {
    public static void main(String [] args){
        // 
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
               sum+=i;
            }
        } 
        if(n==sum){
            System.out.println("perfect number");
        }
        else if(n <sum){
            System.out.println("abundant number");  }    
              else{
            System.out.println("deficient number");
        }
        
    
}}
