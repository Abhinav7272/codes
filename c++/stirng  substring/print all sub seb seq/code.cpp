#include <bits/stdc++.h>
using namespace std;
void sub (string s ,string x, int k, int n){
    
    if (n==k){
        cout<<x<<endl;
    }
    else{
        sub( s, x,k+1,n);
        x=x+s[k];
        sub( s, x,k+1,n);    
    }
}
int main() {
    string s;
    cin>>s;
    int n = s.length();
    sub(s,"",0,n);
    }
