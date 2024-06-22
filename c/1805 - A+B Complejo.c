#include <stdio.h>
#include <stdlib.h>

int main()
{
    long A,B,R;

    scanf("%ld",&A);
    scanf("%ld",&B);
    R = (A+B) + (A-B) + (B+A) + (B-A);
    printf("%ld",R);



}
