import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
          int l= s.length();
          String s1 = s;
          Stack<Character> stack1 = new Stack<Character>();
          
          for(int i =0;i<l;i++){
              if (stack1.empty())
              {
                  stack1.push(s.charAt(i));
              }
              else if( stack1.peek()!=s.charAt(i))
              {stack1.push(s.charAt(i));}
              else{
                  stack1.pop();
              }
          }
          
          
          StringBuilder fi= new StringBuilder();
          while(!stack1.empty()){
              fi.append(stack1.peek());
              stack1.pop();
          }
          System.out.println(fi.reverse());
    }
}