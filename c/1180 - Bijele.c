#include <stdio.h>

int main()
{

	int amt, a, b, c, d, e, f, count = 0;

	int P[6] = {1, 1, 2, 2, 2, 8};
	scanf("%d", &amt);

	while (count < amt)
	{
		scanf("%d %d %d %d %d %d", &a, &b, &c, &d, &e, &f);
		printf("%d %d %d %d %d %d\n", P[0] - a, P[1] - b, P[2] - c, P[3] - d, P[4] - e, P[5] - f);

		count++;
	}

	system("PAUSE");
	return 0;
}
