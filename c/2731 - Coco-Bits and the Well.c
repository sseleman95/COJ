#include <stdio.h>

main()
{
	int a;
	double lado, result, circulo, pi = 3.14159265358979323846;
	scanf("%d", &a);
	while (a--)
	{
		scanf("%lf", &lado);
		circulo = lado / 2 * lado / 2 * pi;
		lado = lado * lado;
		result = lado - circulo;
		printf("%.2f\n", result);
	}
}