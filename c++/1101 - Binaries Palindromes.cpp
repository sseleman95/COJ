#include <iostream>
using namespace std;


void conversion(long numero){
    string binario="";
long dividendo, resto,divisor = 2;
 dividendo = numero;
 while(dividendo >= divisor){
 resto = dividendo % 2;
  if(resto == 1)
   binario = "1" + binario;
  else
   binario = "0" + binario;

   dividendo = dividendo/divisor;
 }
  if(dividendo == 1)
   binario = "1" + binario;
  else
   binario = "0" + binario;

    bool v=true;
        string cadena="";
        int r=binario.length()-1;
        while(r>=0){
            cadena+=binario[r];

            r--;
        }
        for(int i=0;i<binario.length();i++){
            if(binario[i]!=cadena[i]){
                v=false;
            }
        }
        if(v){
            cout<<numero<<" ";
        }
}
    int main(){
        int y;
        long x,x2;
        cin>>y;
        for(int e=y;e>0;e--){

    cin>>x;
    cin>>x2;
    for(long i=x;i<=x2;i++){
      conversion(i);
    }
    cout<<endl;
        }
 return 0;
}
