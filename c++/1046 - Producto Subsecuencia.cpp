#include <iostream>

using namespace std;

int main()
{
    int turn,a,b;
    cin>>turn;
    while(turn-->0){
            cin>>a>>b;
    long long int suma=0;
    for(int i=a;i<=b;i++){
        suma+=i*(i+1)*(i+2);
    }
    cout<<suma%100<<"\n";
    }
    return 0;
}
