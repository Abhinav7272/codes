#include <bits/stdc++.h>
using namespace std;
int partition(int  arr[], int l , int r){
      int pivort= arr[r];
      int  i = l-1;
      for ( int j = l ;j<=r ;j++){
          if(arr[j]<pivort){
              i++;
              swap(arr[i], arr[j]);
          }
      }
      swap(arr[i+1], arr[r]);
      return i+1;
}
void  quicksort (int arr[], int l , int r){
    if(l<r){
        int p= partition(arr, l , r);
        quicksort(arr, l , p-1);
        quicksort(arr, p+1,r);
    }
}
int main() {
    int n; cin>>n ;
    int arr[n];
    for ( int i=0;i<n ;i++){
        cin>>arr[i];
    }
    quicksort(arr, 0, n-1);
    for(int  i =0;i<n;i++){cout << arr[i]<<" ";}
}
