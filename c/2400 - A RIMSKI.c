

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <memory.h>

int main()
{

	char in[20], out[20];
	int Is, Vs, Xs, Ls, Cs, i;

	{
		memset(in, '\0', sizeof(in));
		memset(out, '\0', sizeof(out));
		scanf("%s", in);

		int size = strlen(in);

		Is = Vs = Xs = Ls = Cs = 0;

		for (i = 0; i < size; i++)
		{
			switch (in[i])
			{
			case 'I':
				Is++;
				break;

			case 'V':
				Vs++;
				break;

			case 'X':
				Xs++;
				break;

			case 'L':
				Ls++;
				break;

			case 'C':
				Cs++;
				break;
			}
		}

		i = 0;
		while (i < size)
		{
			if (Cs)
			{
				if (Xs)
				{
					out[i++] = 'X';
					Xs--;
				}
				out[i++] = 'C';
				Cs--;
			}
			if (Ls)
			{
				if ((Xs == 1) || (Xs == 2 && Is == 1 && !Vs))
				{
					out[i++] = 'X';
					Xs--;
				}
				out[i++] = 'L';
				Ls--;
			}

			if (Xs)
			{
				if (Is == 1 && !Vs)
				{
					while (Xs - 1)
					{
						out[i++] = 'X';
						Xs--;
					}
					out[i++] = 'I';
					out[i++] = 'X';
					Is--;
					Xs--;
				}
				else
				{
					while (Xs--)
						out[i++] = 'X';
				}
			}

			if (Vs)
			{
				if (Is == 1)
				{
					out[i++] = 'I';
					out[i++] = 'V';
					Is--;
					Vs--;
				}
				else
				{
					while (Vs--)
						out[i++] = 'V';
				}
			}

			while (Is--)
				out[i++] = 'I';
		}

		out[size] = '\0';
		printf("%s\n", out);
	}

	return EXIT_SUCCESS;
}