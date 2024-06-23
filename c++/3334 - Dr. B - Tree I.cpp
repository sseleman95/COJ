#include <iostream>

using namespace std;

int main()
{
   long num1;
   long num2;
   int cont=0;
   string palabra1;
   string palabra2;
   cin>>num1;
   cin>>palabra1;
   cin>>num2;
   cin>>palabra2;
   bool b=true;
   int i=0,j=0,p=0;;
   while(i<palabra1.length()){
        b=true;
      p=i;
    for(j=0;j<palabra2.length();j++){
      if(palabra1[p]==palabra2[j]){
        p++;
      }else{
         i++;
         cont++;
         b=false;
         break;
      }
    }
    if(b){
        i+=j;
    }
   }
   if(cont!=num1){
   cout<<cont;
   }else{
   cout<<-1;
   }
    return 0;
}
