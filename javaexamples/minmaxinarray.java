package javaexamples;
import java.util.*;


public class minmaxinarray {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();


    }
    int max=0;
    int smax=0;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            smax=max;
            max=arr[i];
        }
        else if(arr[i]>smax && smax<max){
            smax=arr[i];
        }
    }
    
        System.out.println(smax);
    

    sc.close();
}
}