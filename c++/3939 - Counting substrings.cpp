#include<bits/stdc++.h>

// Nayeem Mollick Joy , University of Rajshahi.

using namespace std;

int main()
{
    string s;
    cin>>s;
    set<string>s1;
    for(int i=0;i<s.size();i++)
    {
        for(int len=1;len<=s.size()-1;len++)
        {
            s1.insert(s.substr(i,len));
        }
    }
    cout<<s1.size()+1<<endl;
    return 0;
}