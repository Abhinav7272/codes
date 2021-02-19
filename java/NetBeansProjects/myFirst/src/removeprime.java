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
public class removeprime {
    public static boolean isprime( int a){
               if ( a==0||a==1){
                   return false ;
               }
               else  if ( a==2||a==3){
                   return true ;
               }
               else {
                for ( int i=2 ; i*i<=a;i++){
                    if(a%i==0){
                        return false ;
                    }
                }
                return true ;
               }
    }
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer arr[]= new Integer[n];
        ArrayList<Integer> ls = new ArrayList<>();
        for ( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(!isprime(arr[i])){
                ls.add(arr[i]);
            }
        }
        
        System.out.println(ls);
    }
}
