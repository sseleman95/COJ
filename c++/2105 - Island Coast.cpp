#include <iostream>
#include <algorithm>

using namespace std;


int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
    int a,b,i,j,cont=0;
    cin>>a>>b;
    string x;
    string matriz[a][b];
    for(i=0;i<a;i++){
            for(j=0;j<b;j++){
        cin>>x;
        matriz[i][j]=x;
    }
    }
    for(i=0;i<a;i++){
for(j=0;j<b;j++){
	if(a==1&&b==1){
cont=0;
}
else{
if(i==0&&j==0){
if((matriz[i+1][j]=="-"||matriz[i][j+1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i==0&&j==b-1){
if((matriz[i+1][j]=="-"||matriz[i][j-1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i==a-1&&j==0){
if((matriz[i-1][j]=="-"||matriz[i][j+1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i==a-1&&j==b-1){
if((matriz[i-1][j]=="-"||matriz[i][j-1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i!=0&&i!=a-1&&j==0){
if((matriz[i-1][j]=="-"||matriz[i+1][j]=="-"||matriz[i][j+1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i==0&&j!=0&&j!=b-1){
if((matriz[i+1][j]=="-"||matriz[i][j-1]=="-"||matriz[i][j+1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i==a-1&&j!=0&&j!=b-1){
if((matriz[i-1][j]=="-"||matriz[i][j-1]=="-"||matriz[i][j+1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(j==b-1&&i!=b-1&&i!=a-1){
if((matriz[i+1][j]=="-"||matriz[i-1][j]=="-"||matriz[i][j-1]=="-")&&matriz[i][j]=="+"){
cont+=1;
}
}
if(i!=0&&i!=a-1&&j!=0&&j!=b-1){
	if((matriz[i+1][j]=="-"||matriz[i-1][j]=="-"||matriz[i][j+1]=="-"||matriz[i][j-1]=="-")&&matriz[i][j]=="+"){
	cont +=1;
}
}
}
}
}

cout<<cont;
    return 0;
}
