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
public class stringroetationofanother {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2= sc.next();
        String f="";
        if (s1.length()!=s2.length()){
            System.out.println("kya kru mar jau");
        }
        else{
        f=f.concat(s1);
        f=f.concat(s1);
        if(f.contains(s2)){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
        }
    }
}
