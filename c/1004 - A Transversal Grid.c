#include <stdio.h>
#include <stdlib.h>

main()
{
	int k, f, c;
	scanf("%d", &k);
	while (k--)
	{
		scanf("%d %d", &f, &c);

		if (f % 2)
		{
			if (f > c)
			{
				if (c % 2)
					printf("D\n");
				else
					printf("U\n");
			}
			else
			{
				printf("R\n");
			}
		}
		else
		{
			if (f > c)
			{
				if (c % 2)
					printf("D\n");
				else
					printf("U\n");
			}
			else
			{
				printf("L\n");
			}
		}
	}
}