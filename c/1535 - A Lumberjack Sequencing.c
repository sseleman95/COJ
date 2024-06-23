#include <stdio.h>

main()
{
	int cases, a, b, i, res;
	scanf("%d", &cases);
	printf("Lumberjacks:\n");
	while (cases--)
	{

		res = 1;
		scanf("%d %d", &a, &b);

		if (a < b)
		{
			for (i = 2; i < 10; i++)
			{
				scanf(" %d", &a);
				if (a < b)
				{
					res = 0;
				}
				b = a;
			}
		}
		else
		{
			for (i = 2; i < 10; i++)
			{
				scanf(" %d", &a);
				if (a > b)
				{
					res = 0;
				}
				b = a;
			}
		}
		if (res)
			printf("Ordered\n");
		else
			printf("Unordered\n");
	}
}