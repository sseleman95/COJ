#include <iostream>

using namespace std;
long long int potencia(long long int  base,long long int exponente,long long int modulo){
if(exponente==0){
    return 1;
}
if(exponente%2==0){
        long long int aux=(potencia(base,exponente/2,modulo)%modulo);
    return (aux*aux)%modulo;
}else{
return (base%modulo)*(potencia(base,exponente-1,modulo))%modulo;

}

}

int main()
{
     ios_base::sync_with_stdio(0); cin.tie(0);
    int a,i;
    long b,c;

    cin>>a;

    for(i=0;i<a;i++){
            cin>>b;
            cin>>c;
          cout<<potencia(b,c,1000000000)<<"\n";
    }

    return 0;
}

