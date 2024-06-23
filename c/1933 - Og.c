#include <stdio.h>

main()
{
    int a, b, suma;
    scanf("%d", &a);
    scanf("%d", &b);
    suma = a + b;
    while (suma != 0)
    {
        printf("%d", suma);
        printf("\n");
        scanf("%d", &a);
        scanf("%d", &b);
        suma = a + b;
    }
}
