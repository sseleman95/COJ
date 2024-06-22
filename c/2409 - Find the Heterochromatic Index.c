#include<stdio.h>
main(){
	char nombre[21];
	int a,b;
	scanf("%s",nombre);
	scanf("%d",&a);
	scanf("%d",&b);
	int result=a-b;
	if(result<0) result=result*-1;
	printf("%s %d\n",nombre,result);
}