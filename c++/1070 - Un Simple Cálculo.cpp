#include<iostream>
#include <cstdio>
#include<cmath>
#include<vector>
#include<algorithm>
#include<cstring>

using namespace std;

////Nayeem Shahriar Joy,Applied Physics &Electronic Engineering,University of Rajshahi.

int main()

{
    cin.tie(0);

    ios::sync_with_stdio(0);

    int N;

    while(cin>>N)
    {
       cout<<(N*(N+1)*(2*N+1))/6<<" "<<(N*N*(N+1)*(N+1))/4<<endl;
    }
    return 0;
}