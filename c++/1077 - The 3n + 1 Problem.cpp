#include <iostream>

using namespace std;
int resultado(int a,int b){
    int n=0;
   int minimo=min(a,b);
    int maximo=max(a,b);
    int cont=0;
    int contmin=-1;
    for(int i=minimo;i<=maximo;i++){
        n=i;
        cont=0;
        while(n!=1){
            if(n%2==0){
                n/=2;
                cont++;
            }else{
            n=(n*3)+1;
            cont++;
            }
        }
        if(cont>contmin)contmin=cont;
    }
    return contmin+1;
}
int main()

{
    int a,b,cont;
	while(cin>>a>>b){
		cont=0;
		cont=resultado(a,b);
		cout<<a<<" "<<b<<" "<<cont<<endl;
	}
    return 0;
}
