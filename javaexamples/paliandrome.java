package javaexamples;

public class paliandrome {
    public static int reverse(int num){
        int reversed = 0;
        while(num>0){
            int d=num % 10;
            reversed = reversed * 10 + d;
            num = num / 10;

        }return reversed;
    }
    public static void paliand(int sum){
        
            
            int temp=sum;
            int rev=0;
            while(sum>0){
                int f=sum % 10;
                rev=rev*10 + f;
                sum = sum / 10;

    }
    if(temp==rev){
        System.out.println("paliandrome");
    }else{
        System.out.println("not paliandrome");
    }

    }
    public static void main(String[] args) {
        int a = 58;
        int s=a+reverse(a);
        paliand(s);
    }}

    

