#include <iostream>
#include <algorithm>

using namespace std;

int main(){

	ios_base::sync_with_stdio(0); cin.tie(0);
    int a[3];
    char k;

    while(cin >> a[0] >> a[1] >> a[2]){
    	if(!a[0]&&!a[1]&&!a[2])break;
    	if(a[0]==a[1]&&a[0]==a[2]&&a[1]==a[2]){k='s';}
    	else if(a[0]==a[1]||a[1]==a[2]||a[0]==a[2]){k='p';}
    	else{k='n';}

    	if(a[0]==13&&a[1]==13&&a[2]==13){cout<<"*\n";}
    	else if(k=='n'){cout<<"1 1 2\n";}
    	else if(k=='s'){cout<<a[0]+1<<" "<<a[1]+1<<" "<<a[2]+1<<"\n";}
    	else if(k=='p'){
    		sort(a,a+3);
    		if(a[0]==12&&a[1]==13&&a[2]==13){a[0]=1;a[1]=1;a[2]=1;}
    		else{
    			if(a[0]<a[1]){a[0]=a[0]+1;}
    			else{a[2]=a[2]+1;}

    			if(a[0]==a[1]&&a[1]==a[2]&&a[0]==a[2]){a[2]=a[2]+1;}

    			if(a[2]==14){a[0]=a[0]+1;a[1]=a[1]+1;a[2]=1;}
    			sort(a,a+3);
    		}
    		cout << a[0]<<" "<<a[1]<<" "<<a[2]<<"\n";
		}
	}

    return 0;
}
