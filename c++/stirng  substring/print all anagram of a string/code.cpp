#include <bits/stdc++.h>
using namespace std;

void rec( string s, int n , int j ){
     if(j==n){
         cout<<s<<endl;
         return;
     }
     for(int i=j;i<n;i++){
         swap(s[j],s[i]);
         rec(s,n,j+1);
     }
 }

int main() {
    string s;
    cin>>s;
    int n = s.length();
    rec(s,n,0);
}
