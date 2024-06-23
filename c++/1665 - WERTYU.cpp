#include <iostream>

using namespace std;

int main()
{
ios_base::sync_with_stdio(false), cin.tie(0);
string palabra;
     bool verdadero;
     char teclado[48]="`1234567890-=QWERTYUIOP[]\ASDFGHJKL;'ZXCVBNM,./";
     int i,j;
   while(true){
    getline(cin,palabra);
    i=0;
    while(i<palabra.length()){
            verdadero=true;
            j=0;
        while(j<48){
           if(palabra[i]==teclado[j]){
             cout<<teclado[j-1];
            verdadero=false;
            break;
           }
          j++;
        }
        if(verdadero){
            cout<<palabra[i];
        }
        i++;
    }
    cout<<endl;
    }
    return 0;
}
