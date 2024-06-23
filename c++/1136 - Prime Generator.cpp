#include <iostream>

using namespace std;

int main()
{
      ios_base::sync_with_stdio(0); cin.tie(0);
    int i,j,rInicial,rFinal,a,k;
    bool esPrimo=true;
    cin>>a;
    for(k=0;k<a;k++){
    cin>>rInicial>>rFinal;
    if(rInicial<=1){
	  rInicial=rInicial+1;
  }
  for(i = rInicial;i <= rFinal;i++){

      esPrimo=true;
       for(j = 2;j < i;j++){

       if(i % j == 0){
          esPrimo = false;
       }
       }
       if(esPrimo){
        cout<<i<<"\n";
       }

  }
  cout<<"\n";
    }
    return 0;
}
