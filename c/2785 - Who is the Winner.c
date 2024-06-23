#include <stdio.h>

main()
{
	int casos, suma, acum = 0;
	double promedio;
	scanf("%d", &casos);
	for (int i = 0; i < casos; i++)
	{
		scanf("%d", &suma);
		acum += suma;
	}
	promedio = acum * 1.00 / casos;
	printf("%.2f\n", promedio);
}