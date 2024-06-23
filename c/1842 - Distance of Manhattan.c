#include <stdio.h>
main()
{
	int pruebas, x1, x2, y1, y2, result, tx, ty;
	scanf("%d", &pruebas);
	while (pruebas--)
	{
		scanf("%d", &x1);
		scanf("%d", &y1);
		scanf("%d", &x2);
		scanf("%d", &y2);
		if (x1 > x2)
		{
			tx = (x1 - (x2));
		}
		else
		{
			tx = (x2 - (x1));
		}
		if (y1 > y2)
		{
			ty = (y1 - (y2));
		}
		else
		{
			ty = (y2 - (y1));
		}
		result = tx + ty;
		printf("%d\n", result);
	}
}