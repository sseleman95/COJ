#include <stdio.h>

int main()
{

	int amt, a, b, c, count = 0;

	scanf("%d", &amt);

	while (count < amt)
	{
		scanf("%d %d %d", &a, &b, &c);

		int value = (b * b) - (4 * a * c);

		if (value < 0)
			printf("NO\n");
		else
			printf("SI\n");

		count++;
	}

	system("PAUSE");
	return 0;
}
