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
public class arryainput {
    public static void main(String ar[]){
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int arr[]= new int[n];
        for ( int i=0 ;i<n ;i++){
            arr[i]=s.nextInt();
        }
        for ( int i : arr){
            System.out.print(i+" ");
        }
        
    }
}
