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
public class duplicate {
    public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     Integer arr[]= new Integer[256];
     for ( int i=0;i<256;i++) arr[i]=0;
     
     for( int i=0;i<s.length();i++){
         arr[s.charAt(i)]++;
     }

     for ( int i=0;i<256;i++){
         if(arr[i]>1){
             System.out.println((char)(i)+" "+arr[i]);
         }
     }
     
  }
    
}
