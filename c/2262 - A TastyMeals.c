#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
  return (-1) * (*(int *)a - *(int *)b);
}

int main()
{
  int N, count, i;
  unsigned long long K, sum;
  unsigned long meals[1000];
  sum = 0;
  count = 0;
  scanf("%d %llu", &N, &K);

  for (i = 0; i < N; i++)
    scanf("%lu", &meals[i]);
  qsort(meals, N, sizeof(unsigned long), compare);
  i = 0;

  while (sum < K && i < N)
  {
    count++;
    sum += meals[i++];
  }

  if (sum < K)
    printf("IMPOSSIBLE\n");
  else
    printf("%d\n", count);

  return 0;
}
