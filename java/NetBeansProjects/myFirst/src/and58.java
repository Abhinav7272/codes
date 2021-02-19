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
public class and58 {
public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
   String arr = s.next();
   int n = arr.length();
    int  k=0,sum1= 0, sum2=0, flag=0;
    
    for ( int i=0;i<n ;i+=2)
    {
        sum1+=(arr.charAt(i)-'0');
        if( arr.charAt(i)=='5'){
            flag=1;
        }
        if ( flag == 1){
             sum2+=(arr.charAt(i)-'0');
              k=(k*10)+arr.charAt(i)-'0'; 
        }
        if ( arr.charAt(i)=='8'){
            flag =0;
        }
        
    }
    System.out.print(k+(sum1-sum2));
    
  }   
}
