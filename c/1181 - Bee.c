#include <stdio.h>
#include <stdlib.h>

int main()
{
   int i, a;
   int total = 1;
   int machos = 0;
   int hembras = 1;
   scanf("%d", &a);
   while (a != -1)
   {

      for (i = 0; i < a; i++)
      {
         hembras = machos + 1;
         machos = total;
         total = (machos + hembras);
      }
      printf("%d %d\n", machos, total);
      total = 1;
      machos = 0;
      hembras = 0;
      scanf("%d", &a);
   }
}
