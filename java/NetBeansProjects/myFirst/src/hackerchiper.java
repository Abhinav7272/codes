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

public class hackerchiper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        StringBuilder s1= new StringBuilder();
        s1.append(s.substring(0,k));
        s1.append(s.substring(k,s.length()));
        StringBuilder s2= new StringBuilder();
        for( int i=0;i<n;i++){
        s2.append(s1.charAt(s.charAt(i)-'a'));
    }
    System.out.print(s2);

  }
}    
