import java.util.*;
public class ArrrayDeque {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Character> ad = new ArrayDeque<Character>();
        String s =sc.next();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
            System.out.print(0);
        }
        else{
            int i ;
        for ( i=0;i<s.length();i++){
//            System.out.print("abh"+'\n');
            if(i==0||s.charAt(0)=='('||s.charAt(0)=='{'||s.charAt(0)=='[')
                ad.offerLast(s.charAt(i));
            else{
                if (s.charAt(i)==')'&&ad.peek()=='(') ad.poll();
                else if (s.charAt(i)==']'&&ad.peek()=='[') ad.poll();
                else if (s.charAt(i)=='}'&&ad.peek()=='}') ad.poll();
                else{System.out.print(i); break;}
            }
        
         }
          System.out.println(ad.size());
          if (ad.isEmpty()){
            System.out.println(s.length());
        }
    }
        
   }
}
