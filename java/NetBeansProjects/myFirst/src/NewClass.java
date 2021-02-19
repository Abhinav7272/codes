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
public class NewClass {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         ArrayList<Integer > ar1= new ArrayList<>();
         int n = sc.nextInt();
         Integer arr1[]=new Integer[n];
         for( int i =0;i<n;i++){
             
             arr1[i]=sc.nextInt();
         
         }
         Integer arr2[]=new Integer[n];
         for( int i =0;i<n;i++){
             
             arr2[i]=sc.nextInt();
             
         }
         for (int i =n-1;i>=0;i--){
             
             if(arr1[i]>=arr2[i])
             ar1.add(arr1[i]-arr2[i]);
             else{
             arr1[i-1]=arr1[i-1]-1;
             arr1[i]=arr1[i]+10;
             ar1.add(arr1[i]-arr2[i]);}
             
         }
          Collections.reverse(ar1);
          for ( int i =0;i<n;i++){
              System.out.print(ar1.get(i)+" ");
          }       
    }
}
