#include <bits/stdc++.h>

using namespace std;

const int MAXN = 200001;

int N, M;
vector<int> A[MAXN];
int sal[MAXN];
int R[2 * MAXN];
int Ini[MAXN];
int Fin[MAXN];
int ini, fin, Y;
int salario[4 * MAXN];
int nprop[4 * MAXN];

int ndfs = 0;

void orden(int nodo)
{
    ndfs++;
    R[ndfs] = nodo;
    Ini[nodo] = ndfs;
    for (int i = 0; i < A[nodo].size(); i++)
    {
        orden(A[nodo][i]);
        ndfs++;
        R[ndfs] = nodo;
    }
    Fin[nodo] = ndfs;
}

void propaga(int nod)
{
    salario[2 * nod] += nprop[nod];
    salario[2 * nod + 1] += nprop[nod];

    nprop[2 * nod] += nprop[nod];
    nprop[2 * nod + 1] += nprop[nod];

    nprop[nod] = 0;
}

void update(int nod, int izq, int der)
{
    if (ini > der || fin < izq)
        return;
    if (ini <= izq && der <= fin)
    {
        salario[nod] += Y;
        nprop[nod] += Y;

        return;
    }

    propaga(nod);
    int mid = (izq + der) >> 1;

    update(2 * nod, izq, mid);
    update(2 * nod + 1, mid + 1, der);
}

int query(int nod, int izq, int der)
{
    if (ini < izq || ini > der)
        return 0;

    if (izq == der)
        return salario[nod];

    propaga(nod);

    int mid = (izq + der) >> 1;

    if (ini <= mid)
        return query(2 * nod, izq, mid);
    return query(2 * nod + 1, mid + 1, der);
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M >> sal[1];

    for (int i = 2; i <= N; i++)
    {
        int p;
        cin >> sal[i] >> p;
        A[p].push_back(i);
    }

    orden(1);

    for (int i = 1; i <= M; i++)
    {
        string op;
        int X;
        cin >> op;
        if (op[0] == 'C')
        {
            cin >> X >> Y;
            ini = Ini[X] + 1;
            fin = Fin[X] - 1;
            update(1, 1, ndfs);
        }
        else
        {
            cin >> X;
            ini = Ini[X];
            int s = query(1, 1, ndfs);
            cout << s + sal[X] << '\n';
        }
    }

    return 0;
}
 
