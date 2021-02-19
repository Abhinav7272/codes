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
public class deleteelementfromarryarraylist {
    public  static void main(String arg[]){
        Scanner sc = new  Scanner(System.in);
        int ar1[]= new int[10];
        Integer ar2[] = new Integer[10];
        ArrayList<Integer>  ar3= new ArrayList<>();
        for (int i =0;i<10;i++){
            ar1[i]=sc.nextInt();
            ar2[i]=ar1[i];
            ar3.add(ar1[i]);
        }
//        for int array .
//       int inde;              for int array 
//                        ---------------------------
 

       int key = sc.nextInt();
//       for ( int i=0;i<10;i++){
//            if(ar1[i]==key){
//            for(int j = i; j < ar1.length - 1; j++){
//                    ar1[j] = ar1[j+1];
//                }
//                break;
//           }
//      }
//       for(int i : ar1){
//           System.out.print(i);
//       }
//       
//                              for Integer arr:  same as int 
//                        ---------------------------------------


//                           for arraylist  
//                         ------------------

          for ( int i =0;i<10;i++){
               if(ar3.get(i)==key){
                   ar3.remove(i);
                   break;
               }
          }
          System.out.print(ar3);



    
         


    }
}
