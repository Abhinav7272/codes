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
public class splitbinarystring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//      ArrayDeque<Character> ad = new ArrayDeque<>();
        Integer arr[]= new Integer[256];
         int count=0;
        for( int i =0;i<256;i++){
            arr[i]=0;
        }
        for( int i =0;i<s.length();i++){
            arr[s.charAt(i)]++;
//     System.out.println(arr[48]+"  "+arr[49]+"  "+arr[s.charAt(i)]);
            if (arr[48]==arr[49]){
                count++;
            }
        }
        System.out.println(count);
    }
}
