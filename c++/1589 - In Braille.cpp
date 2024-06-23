#include <iostream>
#include <string>

using namespace std;

string a1[3]={"*.","..",".."};
string a2[3]={"*.","*.",".."};
string a3[3]={"**","..",".."};
string a4[3]={"**",".*",".."};
string a5[3]={"*.",".*",".."};
string a6[3]={"**","*.",".."};
string a7[3]={"**","**",".."};
string a8[3]={"*.","**",".."};
string a9[3]={".*","*.",".."};
string a0[3]={".*","**",".."};


int main()
{
    int d,i,j;
    char num;
    string n;
    while(cin >> d){
        if(!d)break;
        cin >> num;
        if(num=='S'){
            cin >> n;
            for(i=0;i<3;i++){
                for(j=0;j<d;j++){
                    if(n[j]=='1'){cout<<a1[i]<<" ";}
                    if(n[j]=='2'){cout<<a2[i]<<" ";}
                    if(n[j]=='3'){cout<<a3[i]<<" ";}
                    if(n[j]=='4'){cout<<a4[i]<<" ";}
                    if(n[j]=='5'){cout<<a5[i]<<" ";}
                    if(n[j]=='6'){cout<<a6[i]<<" ";}
                    if(n[j]=='7'){cout<<a7[i]<<" ";}
                    if(n[j]=='8'){cout<<a8[i]<<" ";}
                    if(n[j]=='9'){cout<<a9[i]<<" ";}
                    if(n[j]=='0'){cout<<a0[i]<<" ";}
                }
                cout << "\n";
            }
        }
        else{
            string b[100][3];
            for(i=0;i<3;i++){
                for(j=0;j<d;j++){
                    cin >> b[j][i];
                }
            }

            for(i=0;i<d;i++){
                if(b[i][0]==a1[0]&&b[i][1]==a1[1]&&b[i][2]==a1[2]){cout << "1";}
                if(b[i][0]==a2[0]&&b[i][1]==a2[1]&&b[i][2]==a2[2]){cout << "2";}
                if(b[i][0]==a3[0]&&b[i][1]==a3[1]&&b[i][2]==a3[2]){cout << "3";}
                if(b[i][0]==a4[0]&&b[i][1]==a4[1]&&b[i][2]==a4[2]){cout << "4";}
                if(b[i][0]==a5[0]&&b[i][1]==a5[1]&&b[i][2]==a5[2]){cout << "5";}
                if(b[i][0]==a6[0]&&b[i][1]==a6[1]&&b[i][2]==a6[2]){cout << "6";}
                if(b[i][0]==a7[0]&&b[i][1]==a7[1]&&b[i][2]==a7[2]){cout << "7";}
                if(b[i][0]==a8[0]&&b[i][1]==a8[1]&&b[i][2]==a8[2]){cout << "8";}
                if(b[i][0]==a9[0]&&b[i][1]==a9[1]&&b[i][2]==a9[2]){cout << "9";}
                if(b[i][0]==a0[0]&&b[i][1]==a0[1]&&b[i][2]==a0[2]){cout << "0";}
            }
            cout << "\n";
        }
    }
    return 0;
}
