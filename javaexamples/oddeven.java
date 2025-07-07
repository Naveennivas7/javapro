package javaexamples;

public class oddeven {
    public static void main(String[] args) {
        // int n = 12345;
        // int odd = 0;
        // int even=0;
        // while (n > 0) {
        //     int d = n % 10;
        //     if(d%2==0){
        //         even+=d;
        //     }
        //     else{odd+=d;}
    
        //     n = n / 10;
     
        // }
        // if(odd>even){
        //     System.out.println(odd-even);
        // }
        // else{
        //     System.out.println(even-odd);
        // }





    //     int n=1064;
    //      int b=1;
    
    //     while(n>0){
    //         int d=n%10;
    //         if(d!=0){
    //              b=b*d;


    //         }
    //         n=n/10;
    // }
    //     System.out.println(b);








    int n = 24618;
    // int a=n;
    int max=0;
    int min=9;

        while (n > 0) {
            int d = n % 10;
            if(d>max){
                max=d;
            }
            if(d<min){
                min=d;
            }
            n = n / 10;
     
        
}
// int min=9;
// while(a>0){
//     int d = a % 10;
//     if(d<min){
//         min=d;
//     }a=a/10;
// }
System.out.println("min is"+min+" and max is "+max);
       
        }}