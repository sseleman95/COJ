#include <stdio.h>

main()
{
	int n;
	scanf("%d", &n);
	for (int i = 1; i < n + 1; i++)
	{
		printf("%d: I am participating in the Engineer's day.\n", i);
	}
}