#include <iostream>

using namespace std;

int main()
{
    double a,b;
    string s;

    cin>>a;
    cin>>s;
    cin>>b;
    if(s=="+"){
      cout<<int(a+b);
    }
    if(s=="-"){
       cout<<int(a-b);
    }
    if(s=="*"){
      cout<<int(a*b);
    }
    if(s=="/"){

       cout<<a/b;
    }
    if(s=="%"){
        int c=int(a);
        int d=int(b);
      cout<<c%d;
    }
    return 0;
}
