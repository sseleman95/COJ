#include <stdio.h>
#include <string.h>

#define MAXLETTERS 101

main()
{

	char str[MAXLETTERS];
	char c;
	int len1, len2, i, count, cases;

	scanf("%d", &cases);

	while (cases--)
	{
		memset(str, '\0', MAXLETTERS);
		scanf("%s", str);

		len2 = strlen(str);
		len1 = len2 / 2;

		{
			count = 0;
			for (i = 0; i < len1; i++)
			{
				if (str[i] < 'a')
					count++;
				if (str[--len2] < 'a')
					count--;
			}
			if (count)
				printf("NO\n");
			else
				printf("SI\n");
		}
	}
}