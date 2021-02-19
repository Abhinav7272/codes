 #include <bits/stdc++.h> 
using namespace std; 
vector<vector<string> > cal (vector<string> v, int n){
    vector<vector<string>> op;
    unordered_map<string,vector<string>>m;
    for (  int i=0;i<n ;i++){
        string count(26,0);
        for(int j=0;j<v[i].length();j++){
            count[v[i][j]-'a']++;
        }
        m[count].push_back(v[i]);
    }
    for (auto i:m){
        op.push_back(i.second);
    }
    return op;

}

int main() 
{ 
   int n ; cin>>n;
   vector<string> v;
   string s;
   for ( int i=0;i<n;i++){
       cin>>s;
       v.push_back(s);
   }
   vector<vector<string>> op;
   op= cal(v,n);
   for(int i=0;i<op.size();i++){
       for(int j=0;j<op[i].size();j++){
           cout<<op[i][j]<<" ";
       }
       cout<<endl;
   }
} 
