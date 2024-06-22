#include <stdio.h>

int main(void)
{
    int t, k, ok, p;
    scanf("%d", &t);
    while (t--)
    {
        scanf("%d", &k);
        p = 1;
        while (k--)
        {
            scanf("%d", &ok);
            p += (ok - 1);
        }
        printf("%d\n", p);
    }
    return 0;
}