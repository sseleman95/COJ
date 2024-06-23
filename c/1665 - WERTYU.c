#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    bool u = true;
    char teclado[48] = "`1234567890-=QWERTYUIOP[]\ASDFGHJKL;'ZXCVBNM,./";
    char c;
    int i;
    while ((c = getchar()) != EOF)
    {
        u = true;
        i = 0;
        while (i < 48)
        {
            if (c == teclado[i])
            {
                printf("%c", teclado[i - 1]);
                u = false;
                break;
            }
            i++;
        }
        if (u)
        {
            printf("%c", c);
        }
    }
}
