#include <iostream>
#include <string>
#include <set>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    long x,i;
    string a;

    set<char> list;
    cin>>x;
    while(true){
            cin>>a;
        if(!x)break;
        list.clear();
        for(i=0;i<a.size();i++){
            list.insert(a[i]);
        }
        cout << list.size() << endl;
        x--;
    }

    return 0;
}
