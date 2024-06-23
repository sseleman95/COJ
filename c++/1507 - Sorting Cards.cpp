#include <iostream>
#include <vector>
#include <algorithm>

#define W(t) while (t--)
#define FOR(a, b, c, d) for (a = b; a < c; a += d)

using namespace std;

char e[] = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
char c[] = {'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'};

string Convertir(string ca)
{
    int i;
    FOR(i, 0, 12, 1)
    {
        if (ca[0] == e[i])
        {
            ca[0] = c[i];
            break;
        }
    }
    if (ca[1] == 'S')
        ca[1] = 'A';
    if (ca[1] == 'H')
        ca[1] = 'B';
    return ca;
}

string Volver(string ca)
{
    int i;
    FOR(i, 0, 12, 1)
    {
        if (ca[0] == c[i])
        {
            ca[0] = e[i];
            break;
        }
    }
    if (ca[1] == 'A')
        ca[1] = 'S';
    if (ca[1] == 'B')
        ca[1] = 'H';
    return ca;
}

int main()
{
    int H, N, i;
    string card;
    vector<string> cards;
    cin >> H;
    W(H)
    {
        cin >> N;
        W(N)
        {
            cin >> card;
            cards.push_back(Convertir(card));
        }
        sort(cards.begin(), cards.end());
        cout << Volver(cards[0]);
        FOR(i, 1, cards.size(), 1)
        {
            cout << ' ' << Volver(cards[i]);
        }
        cout << endl;
        cards.clear();
    }
}
