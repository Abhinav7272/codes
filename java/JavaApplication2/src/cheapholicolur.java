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
public class cheapholicolur {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            t=t-1;
            int  n = sc.nextInt();
            int  k = sc.nextInt();
            int dis[]= new int[n];
            int rat[]= new int[n];
            for(int i=0;i<n;i++){
                dis[i]=sc.nextInt();
            } 
            int mi  = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                rat[i]=sc.nextInt();
                mi= Math.min( mi ,k*dis[i]+rat[i]);
            }
            System.out.println(mi);
        }
    }
}
