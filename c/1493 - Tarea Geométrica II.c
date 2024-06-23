#include <stdio.h>
#include <string.h>
main()
{
  char nombre[10];
  double a, b, r = 0, pi = 3.14;
  scanf("%s", nombre);
  if (strcmp(nombre, "circle") == 0)
  {
    scanf("%lf", &a);
    r = a * a * pi;
  }
  else
  {
    if (strcmp(nombre, "rhombus") == 0)
    {
      scanf("%lf %lf", &a, &b);
      r = a * b / 2;
    }
    else
    {
      scanf("%lf %lf", &a, &b);
      r = a * b / 2;
    }
  }
  printf("%.2f", r);
}
