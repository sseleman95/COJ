#include <stdio.h>
#include <stdlib.h>

int main()
{
    int p;
    scanf("%d",&p);
    int i;
 for(i=0;i<p;i++){
        int n;
    double a;
    double b;
    double c;
    double d;
   scanf("%d",&n);
   scanf("%lf",&a);
   scanf("%lf",&b);
   scanf("%lf",&c);
   scanf("%lf",&d);
   printf("%d %.2lf\n",(i+1),(a/(b+c)*d));
    }
    return 0;
}
