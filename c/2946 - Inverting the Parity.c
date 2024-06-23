#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,i,n;
    scanf("%d",&a);
for( i=0;i<a;i++){
	scanf("%d",&n);
if(n==1){
printf("%d\n",2);
}else{
if(n%2==0){
n/=2;
if(n%2==0){
while(n%2==0){
n/=2;
}
}
printf("%d\n",n);
}else{
n*=2;
if(n%2!=0){
while(n%2!=0){
n*=2;
}
}
printf("%d\n",n);
}

}
}
}
