#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    unsigned long long int a,b;
    cin>>a>>b;
    while(true){
    cout<<pow(a,b)<<"\n";
        cin>>a>>b;
    if(a==0&&b==0){
        break;
    }
    }
    return 0;
}
