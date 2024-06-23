#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,x,i,a,cont=0,k,j;
    int sum=0;
     scanf("%d",&k);

    for(j=0;j<k;j++){
        scanf("%d",&a);
        int arreglo[a];
    for(i=0;i<a;i++){
            scanf("%d",&x);
        arreglo[i]=x;
        }

    for(i=0;i<a;i++){
        sum+=arreglo[i];
    }
    n=sum;
     sum/=4;

     if(n%4!=0){
        cont++;
}
     printf("%d \n",sum+cont);
     cont=0;
     sum=0;
}



    return 0;
}
