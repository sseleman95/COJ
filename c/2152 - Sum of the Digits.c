#include <stdio.h>
#include <string.h>

main()
{
	int casos, aux, suma;
	scanf("%d", &casos);
	while (casos--)
	{
		char num[21];
		scanf("%s", num);
		for (int i = 0; i < strlen(num); i++)
		{
			if (num[i] != '-')
			{
				aux = num[i] - 48;
				suma += aux;
			}
		}
		printf("%d\n", suma);
		suma = 0;
	}
}