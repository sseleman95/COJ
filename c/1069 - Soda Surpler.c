#include <stdio.h>
#include <stdlib.h>

int main()
{
  int a, j, i;
  scanf("%d", &a);
  for (j = 0; j < a; j++)
  {

    int E, F, C, total, cont = 0, cont2 = 0, multi = 0;
    scanf("%d", &E);
    scanf("%d", &F);
    scanf("%d", &C);
    if (C == 1)
    {
      printf("%d\n", 0);
    }
    else
    {
      total = E + F;
      while (total != 0)
      {
        for (i = C; i <= total; i += C)
        {
          cont += 1;
        }
        cont2 += cont;
        multi = cont * C;
        total -= multi;
        total += cont;
        cont = 0;
        multi = 0;

        if (total < C)
        {
          break;
        }
      }
      printf("%d\n", cont2);
    }
  }

  return 0;
}
