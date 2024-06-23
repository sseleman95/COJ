
#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    int a,x,y,i,sum=0;
    cin>>a;
    for(i=0;i<a;i++){
        cin>>x>>y;
        if(x<0||y<0){
        cout<<"No Number\n";
     }
     else{
        sum=x+y;
     if(x%2==0){

            if(x%2!=0){
                sum-=1;
        }

     cout<<sum<<"\n";
     }
     else{
     cout<<"No Number\n";
     }
     sum=0;
    }
    }
    return 0;

}
