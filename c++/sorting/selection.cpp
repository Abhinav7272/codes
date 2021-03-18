#include <bits/stdc++.h>
using namespace std;
void  selection (int arr[], int n){
    for(int i=1;i<n;i++){
        int key = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[key]){
                key=j;
            }
        }
        swap(arr[key],arr[i]);
    }
}
int main() {
    int n; cin>>n ;
    int arr[n];
    for ( int i=0;i<n ;i++){
        cin>>arr[i];
    }
    selection(arr, n);
    for(int  i =0;i<n;i++){cout << arr[i]<<" ";}
}
