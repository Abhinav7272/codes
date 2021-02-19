
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
public class unionofstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        int arr[]= new int[256];
        for( int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
        }
        for( int i=0;i<s2.length();i++){
            arr[s2.charAt(i)]++;
        }
        for( int i =0;i<256;i++){
        if( arr[i]>=1){
            System.out.print((char)(i));
        }
      }        
    }
}
