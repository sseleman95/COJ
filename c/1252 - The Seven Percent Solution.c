#include <stdio.h>

int main()
{
	char read;
	scanf("%c", &read);

	while (read != '#')
	{

		if (read == ' ')
			printf("%s", "%20");
		else if (read == '!')
			printf("%s", "%21");
		else if (read == '$')
			printf("%s", "%24");
		else if (read == '%')
			printf("%s", "%25");
		else if (read == '(')
			printf("%s", "%28");
		else if (read == ')')
			printf("%s", "%29");
		else if (read == '*')
			printf("%s", "%2a");
		else
			printf("%c", read);

		scanf("%c", &read);
	}
	return 0;
}
