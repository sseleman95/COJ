#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
  bool a=true;
    float x,y;
    while(a){
        cin>>x>>y;
        if(x>0&&y>0){
cout<<"Q1\n";
}
if(x<0&&y>0)
cout<<"Q2\n";

if(x<0&&y<0)
cout<<"Q3\n";

if(x>0&&y<0)
cout<<"Q4\n";

if(x==0||y==0)
cout<<"AXIS\n";


if(x==0&&y==0)
break;


}
return 0;
}
