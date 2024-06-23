#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    long long int numero=0;
    int a,i,x;
    cin>>a;
    for(i=0;i<a;i++){
        cin>>x;
        numero+=x;
    }

    cout<<(numero%128);

    return 0;
}
