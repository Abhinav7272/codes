import java.util.*;
public class reversearr{
    public static  void reverse(Integer arr[]){
      Collections.reverse(Arrays.asList(arr));
      System.out.print(Arrays.asList(arr));
    }
    public static void main(String ar[]){
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        Integer arr[]= new Integer[n];
        for ( int i=0 ;i<n ;i++){
            arr[i]=s.nextInt();
        }
//        List<Integer> list = Arrays.asList();
//        Collections.reverse(Arrays.asList(arr));
//        
//        for ( int i : arr){
//            System.out.print(i+" ");
//        }
        reverse(arr);
        
    }
}