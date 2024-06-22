#include <iostream>


using namespace std;

int main()
{
   int a,c,i,j;
cin>>a;
for(i=0;i<a;i++){
        int suma=0;
        int b;
	cin.get();
cin>>c;
for(j=0;j<c;j++){
    cin>>b;
suma+=b;

}
if(suma%c==0){
	cout<<"YES"<< endl;
}
else{
	cout<<"NO"<< endl;
}
}
}
