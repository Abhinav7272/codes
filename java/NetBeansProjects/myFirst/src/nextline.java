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
public class nextline {
    public static void main(String arg[]){
        Scanner sc = new Scanner( System.in);
        String s = sc.nextLine();
        char cs [] = s.toCharArray();
//        StringBuilder sb = new StringBuilder(s);
//        System.out.print(sb);
        int  low  =0;
        int count=1;
        for ( int i =0; i<s.length() ;i++){
             
                  if(cs[i]==' ' || i==s.length()-1){
                        if (i==s.length()-1) i++;
                        for(int j=low;j<i;j++){
                                    if ( Character.isUpperCase(cs[j]))
                                        { cs[j]+=count;
                                             if ( cs[j]>'Z') cs[j]='Z';
                                        }
                                    else { cs[j]+=count;
                                             if ( cs[j]>'z') cs[j]='z';
                                         }
                                  }
                        low = i+1; 
                        count=1;
                    }
                    else{
                        count++;
                    }
        }
        s=  new String(cs);
        System.out.print(s);
        
        
    }
}
