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
public class stringconcept {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
//          sort a string is possible but there is no function to reverse in string 
//          so we use stringbuilder , stringbuffer
        

/////////////
//          String s =sc.next();
            // convert input string to char array 
//          char  arr[] = s.toCharArray();
//          Arrays.sort(arr);
//          s= new String(arr);
//          System.out.print(s);
/////////////
      String s = sc.next();
      StringBuilder sb = new StringBuilder();
      sb.append(s) ;
//      Collections.sort(sb);
      sb.reverse();// reverse is possible to sort   convert  string toCharArray() 
                  // then make sort function or use array.sort;
        
        



    }
}
