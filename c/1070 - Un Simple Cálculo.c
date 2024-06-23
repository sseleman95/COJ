#include <stdio.h>

main()
{
    int a;
    while (scanf("%d", &a) == 1)
    {
        int b = 0, c = 0;
        for (int i = 1; i <= a; i++)
        {
            b = b + i * i;
        }
        c = (a * (a + 1)) / 2;
        c = c * c;
        printf("%d %d\n", b, c);
    }
}