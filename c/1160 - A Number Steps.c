#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 1001

main()
{
	int i, j, k;
	scanf("%d", &k);
	while (k--)
	{
		scanf("%d %d", &i, &j);
		if (i == j || i == j + 2)
		{
			if (i % 2)
				printf("%d\n", i + j - 1);
			else
				printf("%d\n", i + j);
		}
		else
			printf("No Number\n");
	}
}