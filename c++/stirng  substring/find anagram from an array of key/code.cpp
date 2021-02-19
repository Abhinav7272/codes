 #include <bits/stdc++.h> 
using namespace std; 
vector<string>  cal (vector<string> v, int n, string s){
    vector<string> op;
    string count(26,0);
    for(int i=0;i<n;i++){
        count[s[i]-'a']++;
    }
    for(int i=0;i<v.size();i++){
        string check(26,0);
        for( int j=0;j<v[i].size();j++){
            check[v[i][j]-'a']++;
        }
        if(count==check){
            op.push_back(v[i]);
        }
    }
  return op;
      
} 
int main(){
    int n ;
    cin>>n;
    vector<string> v,v2;
    for (int i =0;i<n;i++){
        string s;
        cin>>s;
        v.push_back(s);
    }
    string key;
    cin>>key;
    v2=cal(v,n,key);
    for(string s:v2){
        cout<<s<<" ";
    }
}
