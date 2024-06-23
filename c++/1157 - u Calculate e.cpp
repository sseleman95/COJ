#include <bits/stdc++.h>

using namespace std;

double factorial(double n){
	if(n==0 || n==1)return 1.0;
	double fact=1.0;
	for(int i=2; i<=n; i++){
		fact*=(double)i;
	}
	return fact;
}

int main(){
	double n=0;
	cout<<"n"<<" e"<<endl;
	cout<<"- -----------"<<endl;
	for(int i=0; i<10; i++){
		n+=1/factorial(i);
		if(i>2)printf("%d %.9lf\n",i,n);
		else cout<<i<<" "<<n<<endl;
	}
	return 0;
}
