/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABHINAV  KUMAR GAUR
 */
import java.util.*;
public class priorityqueuebracketstaack {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    PriorityQueue<Character> p= new PriorityQueue<>();
    for (int i=0;i<s.length();i++){
        {
                p.add(s.charAt(i));    
        }
    }
    p.poll();
    System.out.println(p);
    System.out.print(p.peek());
    
    
    for( char i : p){
        System.out.print(i);
    }
   }
}
