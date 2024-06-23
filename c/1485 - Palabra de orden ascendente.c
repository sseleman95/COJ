#include <stdio.h>
#include <string.h>
main()
{
	char palabra[1000];
	int num[1000];
	int aux;
	scanf("%s", palabra);
	int largo = strlen(palabra);
	for (int i = 0; i < largo; i++)
	{
		num[i] = palabra[i];
	}
	for (int i = 0; i < largo - 1; i++)
	{
		for (int j = i + 1; j < largo; j++)
		{
			if (num[i] > num[j])
			{
				aux = num[i];
				num[i] = num[j];
				num[j] = aux;
			}
		}
	}
	for (int i = 0; i < largo - 1; i++)
	{
		printf("%c", num[i]);
	}
	printf("%c\n", num[largo - 1]);
}