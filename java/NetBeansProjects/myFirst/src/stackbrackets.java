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
 
public class stackbrackets {
 public static void main( String arg[]){
  Scanner sc= new Scanner(System.in);
  String s = sc.next();
  LinkedList<Character> ll = new LinkedList<>();
  for( int i =0;i<s.length();i++){
      ll.add(s.charAt(i));
      
  }
  for ( char c : ll){
      System.out.println(c);
  }
 }    
}
