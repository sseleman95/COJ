#include <stdio.h>

main()
{
	int n, num;
	scanf("%d", &n);
	while (n--)
	{
		scanf("%d", &num);
		num = (((((num + 3) * 2) + 3) * 2) + 3) * 2;
		printf("%d\n", num);
	}
}