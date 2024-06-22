#include<stdio.h>
long long int square(long long int s){
return s*s;
}
long long int bigmod(long long int b, long p, long m){
if (p == 0)
return 1;
else if (p%2 == 0)
return square( bigmod (b,p/2,m)) % m;
else
return ((b % m) * bigmod( b,p-1,m)) % m;
}
int main(){
long b=2,m=1000000007;
long long int p,sum;
scanf("%lld",&p);
while(p!=0){
sum = bigmod( b, p+1, m);
printf("%lld\n", sum-1);
scanf("%lld",&p);
}
return 0;}