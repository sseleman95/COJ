#include <stdio.h>
#include <memory.h>

main()
{
	int cases, candidates, regions, r, c, in, maxin, result;
	int res[101][6];

	scanf("%d", &cases);

	while (cases--)
	{
		scanf("%d %d", &candidates, &regions);
		memset(res, 0, sizeof(res));
		r = regions;
		while (r--)
		{
			c = candidates;
			while (c--)
			{
				scanf("%d", &res[r][c]);
			}
		}
		maxin = 0;
		c = candidates;
		while (c--)
		{
			in = 0;

			r = regions;
			while (r--)
			{
				in += res[r][c];
			}
			if (in > maxin)
			{
				maxin = in;
				result = c;
			}
		}

		printf("%d\n", candidates - result);
	}
}