#include <stdio.h>
#include <stdlib.h>
#include <Math.h>
int main()
{
    int radio;
    double eucli;
    double taxi;
    scanf("%d",&radio);
    eucli=M_PI*pow(radio,2);
    printf("%.4lf",eucli);

    return 0;
}
