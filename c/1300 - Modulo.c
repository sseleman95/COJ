#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bol=0;
    int res[10];
    int num,i,j,cont=0;
    for(i=0;i<10;i++){
        scanf("%d",&num);
        res[i]=num%42;
    }


    for(i=0;i<9;i++){
        for(j=i+1;j<10;j++){
            if(res[i]!=res[j]){

            }else{
                 bol=1;
                 break;
            }
        }
        if(bol==0){
            cont++;
        }else{
        bol=0;
        }
    }
    printf("%d",cont+1);
    return 0;
}
