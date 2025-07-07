package javaexamples;

public class spynumber {
    public static void main(String[]args){
        int n=123;
        int sum=0;
        int product=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            product*=d;
            n=n/10;
    
}
if(sum==product){
    System.out.println("spy no");
}
else{
    System.out.println("not spy no");
}

    }
}
