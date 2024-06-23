#include <stdio.h>
int main()
{
	int n;
	scanf("%d", &n);
	n = (n >= 0) ? (n * (1 + n)) / 2 : (((n * -1) * ((n * -1) + 1) / 2) * -1) + 1;
	printf("%d", n);
	return 0;
}
