#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    int a,i,n;
    cin>>a;
for( i=0;i<a;i++){
	cin>>n;
if(n==1){
cout<<2<<"\n";
}else{
if(n%2==0){
n/=2;
if(n%2==0){
while(n%2==0){
n/=2;
}
}
cout<<n<<"\n";
}else{
n*=2;
if(n%2!=0){
while(n%2!=0){
n*=2;
}
}
cout<<n<<"\n";
}

}
}
}
