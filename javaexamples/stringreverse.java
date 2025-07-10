package javaexamples;
public class stringreverse {
    public static void main(String[]args){
        String a="    hello world   ";
        String s=a.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            
           if(s.charAt(i)==' '){
            break;
          }count++;
        
        }
      System.out.println(count);
    }
    
}
