#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	int a, b;
	scanf("%d%d", &a, &b);
	printf("%d\n%d\n%d\n%d\n%d\n", a + b, a - b, a * b, a / b, a % b);
	return EXIT_SUCCESS;
}
