#include <stdio.h>
#include <ctype.h>

int main()
{
	char word;
	int answer = 1;
	scanf("%c", &word);

	while (word != '*')
	{

		int value = tolower(word);
		if (value > 96 && value < 123)
		{
			char pre, curr;
			pre = curr = word;

			scanf("%c", &curr);
			while (curr != '\n')
			{
				int checkA = tolower(pre);
				if (checkA < 95 || checkA > 122)
				{
					int checkB = tolower(curr);
					if (checkB > 96 && checkB < 123)
					{
						if (checkB != value)
						{
							answer = 0;
						}
					}
				}
				pre = curr;
				scanf("%c", &curr);
			}

			if (answer == 1)
			{
				printf("Y\n");
			}
			if (answer == 0)
			{
				printf("N\n");
				answer = 1;
			}
		}
		scanf("%c", &word);
	}
	return 0;
}
