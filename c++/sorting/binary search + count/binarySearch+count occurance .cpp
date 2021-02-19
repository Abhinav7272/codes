#include <bits/stdc++.h>
using namespace std;
 int binary(int arr[],int key , int flag , int n ){
     int left=0, right = n-1,res=-1,mid=0;
     while(left<=right){
         mid = left+(right-left)/2;
         if(arr[mid]==key && flag==0){
              res= mid ; 
              right=mid-1;
         }
         else if (arr[mid]==key && flag==1){
              res= mid ; 
              left=mid+1;
         }
         else if(arr[mid]==key && flag==-1){
               res=mid;
               return 0;
         }
         else if(arr[mid]< key){
             left=mid+1;
         }
         else {
             right = mid-1;
         }
     }
     return res ;
 }
int main() {
      int n,t,key ; cin>>t ; 
      while(t--){
          cin>>n;
      int arr[n];
      for ( int i=0;i<n;i++)
          cin>>arr[i];
      cin>>key ;
      if(binary(arr,key,-1,n)){

               cout<<"NOT FOUND"<<endl;

           }
      else {

            int r= binary(arr,key,0,n);
            int l= binary(arr,key,1,n);
            cout<< key<<"-"<<l-r+1<<endl;
      }
   }
}
