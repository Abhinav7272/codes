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

public class anagramtogethr {
    public static ArrayList<ArrayList<String>> ana(ArrayList<String > a, int n){
        ArrayList<ArrayList<String>> op= new ArrayList<>();
        HashMap<ArrayList<Integer>, ArrayList<String>> hm= new HashMap<>();
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=0;i<26;i++){
            c.add(0);
        }
        for(int i=0 ;i<a.size();i++)
        {    ArrayList<Integer> count=new ArrayList(c);
            for(int j=0;j<(a.get(i)).length();j++){
                String s=a.get(i);
                int t =count.get(s.charAt(i)-'a');
                count.set(s.charAt(i)-'a',t+1);
            }
            if(!hm.containsKey(count))
            {       hm.put(count, new ArrayList<>());
                    hm.get(count).add(a.get(i));
            }   
            
            else 
                 hm.get(count).add(a.get(i));
            
        }

        for (ArrayList<String> x : hm.values()) {
            op.add(x);
        }
            
            
         return op;
        
        
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> ar = new ArrayList<>();
    String s;
    for ( int i=0;i<n;i++){
       s=sc.next();
       ar.add(s);
    }
    ArrayList<ArrayList<String>> op = new ArrayList<ArrayList<String>>();
    op=ana(ar,n);
    for(ArrayList<String> x:op){
        x.forEach(t -> {
            System.out.println(t);
        });
    }
            
          
}    
}
