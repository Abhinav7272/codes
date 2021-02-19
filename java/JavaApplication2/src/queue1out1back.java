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
public class queue1out1back {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
         ArrayDeque<Integer> dq= new ArrayDeque();
         for ( int i =1;i<=n;i++) dq.add(i);
         while(dq.size()!=1){
             dq.removeFirst();
             int a= dq.getFirst();
             dq.removeFirst();
             dq.addLast(a);
         }
         System.out.println(dq.pollLast());
    }
}
