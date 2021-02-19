#include <bits/stdc++.h>
using namespace std;
int main() {
int  no, key ,out=0; cin>>no>>key;
for ( int y=1 ; y<=no ; y++){
    string s="";
    int n =y;
    while(n){
        if(n&1) s+="1";
        else s+="0";
        n/=2;
    }
   int i=0,j=1,k=2,count=0;
   for ( int x=0; k<s.length() ; x++){
        if(s[i]=='1'&&s[j]=='0'&&s[k]=='1'){
            count++;
        }
            i++;j++;k++;
      }
    if(count>=key) out++;
  }
  cout<<out;
}
