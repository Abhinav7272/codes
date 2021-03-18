#include <bits/stdc++.h>
using namespace std;
void mergefinal(int  arr[], int left , int m , int rig){
    int  n1= m-left+1;
    int  n2 = rig-m;
    int l[n1],r[n2];
    for( int i = 0 ;i<n1;i++) l[i] = arr[left+i];
    for( int j=0;j<n2;j++) r[j]=arr[m+1+j];
    int i=0,j=0,k=left;
    while(i<n1&&j<n2){
        if(l[i] <= r[j]){
            arr[k++]= l[i++];
        }
        else{
            arr[k++] = r[j++];
        }
    }
    while( i<n1){
        arr[k++]= l[i++];
    }
    while(j<n2){
        arr[k++]=r[j++];
    }
}
void  mergebreak (int arr[], int l , int r){
    if(l<r){
        int m = (l+r)/2;
        mergebreak(arr, l, m);
        mergebreak(arr, m+1, r);
        mergefinal(arr, l , m , r);
    }
}

void mergesort(int arr[] , int n ){
    mergebreak(arr, 0 , n-1);
}
int main() {
    int n; cin>>n ;
    int arr[n];
    for ( int i=0;i<n ;i++){
        cin>>arr[i];
    }
    mergesort(arr, n);
    for(int  i =0;i<n;i++){cout << arr[i]<<" ";}
}
