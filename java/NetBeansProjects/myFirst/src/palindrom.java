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
public class palindrom {
    public static void main(String agr[]){
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        StringBuilder s =  new StringBuilder(s1);
        StringBuilder r =  new StringBuilder(s);
        r.reverse();
        int dp[][]  = new int[s.length()+1][s.length()+1];
        for ( int i=0;i<= r.length();i++){
            for( int j=0;j<=r.length();j++){
                if(i==0)
                dp[i][j]=0;
                if(j==0)
                dp[i][j]=0;
            }
        }
        int m=0;
        int k=0,l=0;
        for ( int i=1;i<= r.length();i++){
            for( int j=1;j<=r.length();j++){
              if(s.charAt(i-1)==r.charAt(j-1)){
                  dp[i][j]=dp[i-1][j-1]+1;
                  m=Math.max(m,dp[i][j]);
                  if(m==dp[i][j]){k=i;l=j;}
              }
              
              else 
                  dp[i][j]=0;
            }
        }
//        System.out.println(k+" "+l);

        System.out.println(m);
//        for ( int i=k-1;i<l;i++){
//            System.out.print(s.charAt(i));
//        }
    }
}
