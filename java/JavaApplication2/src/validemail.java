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
public class validemail {
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        String s = sc.next();
        String s2="";
        char arr[]= s.toCharArray();
       for (int i =0;i<arr.length;i++){
           char c= arr[i];
           if(c=='@'){
               s2+=' ';
           }
           else  if(c=='.')
               break;
           else
             s2+=c;
       }
       System.out.print(s2);
    }
}
