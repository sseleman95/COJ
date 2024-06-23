#include <iostream>

using namespace std;

int main()
{
     ios_base::sync_with_stdio(0); cin.tie(0);
     int a,i,j,k,sum=0,x,sum2=0;
     cin>>a;

     for(i=0;i<a;i++){
            int c,d;
            cin>>c>>d;
       for(j=0;j<c;j++){
        cin>>x;
        if(x>sum){
            sum=x;
        }
       }
       for(j=0;j<d;j++){
        cin>>x;
        if(x>sum2){
            sum2=x;
        }
       }
     if(sum2>sum){
        cout<<"MechaGodzilla"<< endl;
     }
     else{
        cout<<"Godzilla"<< endl;
     }
     sum=0;sum2=0;
     }



    return 0;
}
