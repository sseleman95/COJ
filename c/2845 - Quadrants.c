#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i=0;
    float x,y;
    while(i<1){
        scanf("%f",&x);
        scanf("%f",&y);
        if(x>0&&y>0){
printf("Q1\n");
}
if(x<0&&y>0){
printf("Q2\n");
}
if(x<0&&y<0){
printf("Q3\n");
}
if(x>0&&y<0){
printf("Q4\n");
}
if(x==0||y==0){
printf("AXIS\n");

}
if(x==0&&y==0){
break;
}



    }
    return 0;
}
