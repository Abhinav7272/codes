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
public class stringsort {
    public static void main( String args[]){
        Scanner s = new Scanner(System.in);
        String st= s.next();
//        StringBuilder  s1 = new StringBuilder();
//        s1.append(st);
        char arr[]= st.toCharArray();
        Arrays.sort(arr);
        System.out.print(arr);
        st =  new String(arr);
        System.out.print(st+" "+ st);
        
    }
}
