#include <stdio.h>
main()
{
	double mont[100];
	int numMont, pos;
	scanf("%d", &numMont);
	double temp;
	scanf("%lf", &mont[0]);
	temp = mont[0];
	pos = 0;
	for (int i = 1; i < numMont; i++)
	{
		scanf("%lf", &mont[i]);
		if (mont[i] >= temp)
		{
			temp = mont[i];
			pos = i;
		}
	}
	printf("%d\n", pos + 1);
}