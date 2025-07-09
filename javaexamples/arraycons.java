package javaexamples;

import java.util.*;

public class arraycons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    int[] arr=new int [n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
}
int min=arr[0];
int max=arr[0];

// int sum=0;
for(int j=0;j<n;j++){
    // sum+=arr[j];
    if(arr[j]<min){
        min=arr[j];
    }
    if(arr[j]>max){
        max=arr[j];
    }
//    System.out.print(arr[j]+" ");
}
System.out.println("minimum is "+min);
System.out.println("maximum is "+max);
// 
// System.out.println(arr[4]);
 sc.close();       
}}
