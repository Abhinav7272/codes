#include <bits/stdc++.h>
using namespace std;
int main() {
    string s ;
    cin>>s;
    s+='-';
    int count =1;
    string op="",sub="";
    for( int i =1;i<s.length();i++){
        if(s[i]==s[i-1]){
            count++;
        }
        else{
            if(count!=2){
                while(count--){
                    op+=s[i-1];
                }
            }
            count=1;
        }
    }
    cout<<op;
}
