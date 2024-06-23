// GuessingNumbers2621.c
#include <stdio.h>

int main(void)
{
    int n, cont = 0;
    scanf("%d", &n);
    while (n)
    {
        n /= 2;
        cont++;
    }
    printf("%d\n", cont);
    return 0;
}