#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,a;
    while(scanf("%d",&n)&&n!=0){
          a=(n*(n-1))+1;
            printf("%d => %d\n",n,a);
                   }
    return 0;
}
