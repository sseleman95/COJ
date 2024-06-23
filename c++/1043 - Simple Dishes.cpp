#include <iostream>

using namespace std;

int main()
{
    int arreglo[]={1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384};

    int a;
    cin>>a;
    int pesos[a];
    for(int i=0;i<a;i++){
        cin>>pesos[i];
    }
    for(int i=0;i<a;i++){
            int platos[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int j=14;j>=0;j--){
            if(pesos[i]>=arreglo[j]){
                pesos[i]-=arreglo[j];
                platos[j]=1;
            }
            if(pesos[i]<=0){
                break;
            }
        }
    for(int k=0;k<15;k++){
        if(platos[k]==1){
            cout<<k<<" ";
        }
    }
cout<<"\n";
    }
    return 0;
}
