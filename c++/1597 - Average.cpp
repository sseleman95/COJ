#include <iostream>
#include <algorithm>
#include <vector>
#include <cstdio>
#include <math.h>
#include <conio.h>
using namespace std;

vector<int> total;

int main()
{
   int H,L,N,i,x;

   double sum=0;
   cin>>H>>L>>N;
   while(true){
        if(H==0&&L==0&&N==0){
            break;
        }

    for(i=0;i<N;i++){
            cin>>x;
        total.push_back(x);
}
sort(total.begin(),total.end());

for(i=0;i<H;i++){
    total.erase(total.begin()+total.size()-1);
}
for(int i=0;i<L;i++){
	total.erase(total.begin());
}
for(i=0;i<total.size();i++){
    sum+=total[i];
}
sum/=total.size();

printf("%6f",sum);
total.clear();
cin>>H>>L>>N;
   }
    return 0;
}

