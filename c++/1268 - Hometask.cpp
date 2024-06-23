#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    long n;
    cin>>n;
long suma=1;
long i;
if(n!=0){
for(i=n-1;i>1;i--){
suma=suma*i;
}
suma=n*suma;
}
n=n*n;
if(suma%n==0){
cout<<"YES";
}
else{
        cout<<"NO";
}

    return 0;
}
