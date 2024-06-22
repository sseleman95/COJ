#include <stdio.h>
#include <math.h>

int main(void)
{
    int t;
    double a, s, side;
    scanf("%d", &t);
    while (t--)
    {
        scanf("%lf %lf", &a, &s);
        printf("%.2f\n", sqrt(pow(s, 2) - (4 * a)) / 2);
    }
    return 0;
}