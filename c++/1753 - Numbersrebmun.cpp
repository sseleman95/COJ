#include <iostream>
#include <map>
#include <string>

using namespace std;

void toup(string &str){
    int len=str.length();
    for(int i=0; i < len; i++)
        if(str[i]>='a'&&str[i]<='z') str[i]=str[i]-32;
}

int main()
{
    map<char,int>key;
    key['A']=2; key['B']=2; key['C']=2;
    key['D']=3; key['E']=3; key['F']=3;
    key['G']=4; key['H']=4; key['I']=4;
    key['J']=5; key['K']=5; key['L']=5;
    key['M']=6; key['N']=6; key['O']=6;
    key['P']=7; key['Q']=7; key['R']=7; key['S']=7;
    key['T']=8; key['U']=8; key['V']=8;
    key['W']=9; key['X']=9; key['Y']=9; key['Z']=9;
    string str;
    int test;
    cin >> test;
    while(test--){
        cin >> str;
        int len=str.length();
        toup(str);
        //cout << str << endl;
        int i,j;
        for(i=0,j=len-1; i < j; i++,j--){
            if(key[str[i]]!=key[str[j]]) break;
        }
        if(i < j) cout << "NO" << endl;
        else cout << "YES" << endl;
    }
    return 0;
}
