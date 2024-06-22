#include <stdio.h>
main(){
       double n, circulo,pi=3.141592653589793;
       while(scanf("%lf",&n)==1){
       n=n*n;
       n=n-((n/9)*pi)-(n/3);
       printf("%.4f\n",n);
       }
}