#include<iostream>
#include<cstdio>

using namespace std;

int phie(int n)

{
    int result =n;
    for(int p=2;p*p<=n;++p)
    {
        if(n%p==0)
        {
            while(n%p==0)
            {
                n=n/p;
            }
            result=result-(result/p);
        }
    }
    if(n>1)
    {
        result=result-(result/n);
    }
    return result;
}

int main()

{
    int n;
    cin>>n;
    cout<<phie(n)<<endl;
}