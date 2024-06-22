#include<stdio.h>
main(){
	int n,cont,aux;
	int nums[10001]={0};
	scanf("%d",&n);
	cont=n;
	while(cont--){
		scanf("%d",&aux);
		nums[aux]=1;
	}
	cont++;
	n++;
	for(int i=1;i<n;i++){
		if(nums[i]==0){
			cont++;
		}
	}
	printf("%d\n",cont);
}