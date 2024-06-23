#include <stdio.h>
#include <string.h>

int main()
{
	int amt;
	char word[101];

	scanf("%d", &amt);

	int i;
	for (i = 0; i < amt; i++)
	{
		scanf("%s", word);
		int length = strlen(word), count = 0, CapitalLetters = 0, CommonLetters = 0;

		while (count < length)
		{
			int value = word[count];

			if (value > 64 && value < 91)
			{
				CapitalLetters++;
			}
			else if (value > 96 && value < 123)
			{
				CommonLetters++;
			}
			count++;
		}

		if (CapitalLetters == CommonLetters)
			printf("SI\n");
		else if (CapitalLetters != CommonLetters)
			printf("NO\n");
	}

	return 0;
}
