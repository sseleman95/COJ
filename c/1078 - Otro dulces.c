#include <stdio.h>
main()
{
      int casos, ninios, dulces, aux;
      scanf("%d", &casos);
      for (int j = 0; j < casos; j++)
      {
            aux = 0;
            scanf("%d", &ninios);
            for (int i = 0; i < ninios; i++)
            {
                  scanf("%d", &dulces);
                  aux = aux + dulces;
            }
            if (aux % ninios == 0)
                  printf("YES\n");
            else
                  printf("NO\n");
      }
}
