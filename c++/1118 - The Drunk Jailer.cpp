#include <iostream>
using namespace std;


int main()
{
  int n,celdas;
  cin>>n;
  while(n-->0){
        int cont=0;
        cin>>celdas;
int arreglo[celdas+1];
for(int i=1;i<=celdas;i++){
    arreglo[i]=1;
}
for(int i=2;i<=celdas;i++){
    for(int j=i;j<=celdas;j+=i){
        if(arreglo[j]==0){
            arreglo[j]=1;
        }else{
        arreglo[j]=0;
        }
    }
}
for(int i=1;i<=celdas;i++){
   if(arreglo[i]==1){
        cont++;
    }
}
cout<<cont<<"\n";
}
}
