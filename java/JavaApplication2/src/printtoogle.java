import java.util.*;
public class printtoogle {
     static char[] reverse(char a[], int n) 
       { 
         char[] b = new char[n]; 
         int j = n; 
         for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }  
     return  b;
    } 
    public static void main(String ar[]){
          Scanner sc = new Scanner ( System.in);
          String s = sc.next();
          char str[] = new char[s.length()];
          str = s.toCharArray();
          for(int i=0;i<s.length();i++){
              char  c = str[i];
              if(Character.isUpperCase(c)){
                 str[i]=Character.toLowerCase(c);
              }
              else{
                  str[i]=Character.toUpperCase(c);
              }
            }
             s = new String(str);
             String  sub = s.substring(0, 4);
//             System.out.print(sub);
            char st[]= reverse(str,s.length());
             for( char  x : st){
                 System.out.print(x);
             }
    }
}
