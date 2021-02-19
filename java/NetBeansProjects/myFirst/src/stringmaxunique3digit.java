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
public class stringmaxunique3digit {
    public static void main(String args[]){
        Scanner sc=  new Scanner (System.in);
        String s =sc.next();
        Integer arr[] = new Integer[10];
        Arrays.fill(arr,0);
        Arrays.sort(arr);
        ArrayList<Integer> ar =  new ArrayList<>();
        for ( int i=0;i<s.length();i+=2){
            ar.add(s.charAt(i)-'0');
            arr[s.charAt(i)-'0']++;
        }
       Collections.sort(ar);
       Collections.reverse(ar);
       String out = "";
       for ( int i=0;i<3;i++){
           out+=ar.get(i);
       }
       System.out.println(out);  
    }
}
