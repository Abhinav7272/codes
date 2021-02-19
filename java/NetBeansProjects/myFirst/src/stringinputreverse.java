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

public class stringinputreverse {
    public static void main(String arr[]){
        Scanner s = new Scanner(System.in);
 
        String t =s.next() ;
// String i = new String() ;
        StringBuilder s1 = new StringBuilder();
        s1 = s1.append(t);
// System.out.println(t);
        System.out.print(s1.reverse());
    }  
}
