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
public class aarry1out1back {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
         ArrayList <Integer> dq= new ArrayList();
         for ( int i =1;i<=n;i++) dq.add(i);
         while(dq.size()!=1){
             dq.remove(0);
             int a= dq.get(0);
             dq.remove(dq.size()-1);
             dq.add(a);
         }
         System.out.println(dq.get(0));
    }
}