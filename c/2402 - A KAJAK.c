#include <stdio.h>

int main()
{
	int rows, cols, c, r, found, foundInCol, pos, aux;
	char arr[52][52];
	int output[10];

	for (c = 0; c < 10; c++)
	{
		output[c] = 0;
	}

	scanf("%d %d", &rows, &cols);

	for (r = 0; r < rows; r++)
	{
		for (c = 0; c <= cols; c++)
		{
			scanf("%c", &arr[r][c]);
		}
	}

	found = 0;
	pos = 0;

	for (c = cols - 1; c >= 0; c--)
	{
		foundInCol = 0;
		;
		for (r = 0; r < rows; r++)
		{
			switch (arr[r][c])
			{
			case 'S':
			case 'F':
			case '.':
				break;
			default:
				aux = arr[r][c] - '0';

				if (output[aux] == 0)
				{
					if (foundInCol == 0)
						pos++;

					output[aux] = pos;

					foundInCol = 1;
					found++;
				}
				break;
			}
		}

		if (found == 9)
			break;
	}
	for (found = 1; found < 10; found++)
		printf("%d\n", output[found]);
}