#include <stdio.h>

int main(){
 int t,a,b;
 scanf("%d",&t);
 while(t!=0){
 	scanf("%d %d",&a,&b);

 	if(a==b&&a>1){
 	if(a%2==0){printf("L\n");}
 	else{printf("R\n");}
 	}
 	else if(b==1){
 	if(a==1){printf("R\n");}
 	else{printf("D\n");}
 	}
 	else if(a>b&&b>1){
 	if(b%2==0){printf("U\n");}
 	else{printf("D\n");}
 	}
 	else if(b>a){
 	if(a%2==0){printf("L\n");}
 	else{printf("R\n");}
 	}
 	t--;
 }
 return 0;
}