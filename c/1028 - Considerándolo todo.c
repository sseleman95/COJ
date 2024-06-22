#include<stdio.h>
#include <string.h>
main(){
        char n[40],m[40];
        int cort=-1,largo,largo2;
        int cont=0;
        while(scanf("%s",n)==1){
            scanf("%s",m);
            largo=strlen(n);
            largo2=strlen(m);
        for (int i = 0; i < largo; i++) { 
            for (int j = cort+1; j < largo2; j++) {
                if (n[i]==m[j]) {
                    cort=j;
                    cont++;
                    break;
                }
            }
        }
        if(cont==largo){
            printf("Yes\n");
        }
        else{
            printf("No\n");
        }
        cont=0;
        cort=-1;
    }
    }
