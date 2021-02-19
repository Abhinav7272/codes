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
public class arraypass {
    public static void fun(int arr[]){
        for(int i =0;i<5;i++){
            arr[i]+=1;
        }
    }
    public static void fun2 (StringBuilder s){
        s.append("ac");
    }
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int arr[]= new int[5];
//        for ( int i=0; i<5 ; i++){
//           arr[i]=sc.nextInt();
//        }
//        fun(arr);
//            StringBuilder sb = new StringBuilder("Abhin");
//             fun2(sb);
//             String s= sb.toString();
    
            char  s='a';
             s+=1;
             s=s+1;
             System.out.print(s);

//        for (int i : arr){
//            System.out.print(i);
//        }
        }
}
