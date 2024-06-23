#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
  long numerador,denominador;
  cin>>numerador>>denominador;
  while(numerador!=0&&denominador!=0){
        cout<<numerador/denominador<<" "<<numerador%denominador<<" / "<<denominador<<"\n";

    cin>>numerador>>denominador;
  }
    return 0;
}
