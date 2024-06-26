#include <bits/stdc++.h>

using namespace std;

typedef pair<int, int> pii;

int N, K, L;
vector<pii> fK;
map<vector<int>, int> m;

vector<pii> fact(int K)
{
    vector<pii> f;
    if (K % 2 == 0)
    {
        f.push_back(pii(2, 0));
        while (K % 2 == 0)
        {
            K /= 2;
            f[0].second++;
        }
    }

    for (int i = 3; i * i <= K; i += 2)
        if (K % i == 0)
        {
            pii x(i, 0);
            while (K % i == 0)
            {
                K /= i;
                x.second++;
            }
            f.push_back(x);
        }

    if (K > 1)
        f.push_back(pii(K, 1));

    return f;
}

typedef long long LL;
const LL MOD = 1e9 + 7;
typedef std::vector<std::vector<LL>> matrix;

matrix matrixMultiplication(matrix &matrix1, matrix &matrix2)
{

    matrix result;
    int n = matrix1.size();
    for (int i = 0; i < n; i++)
    {
        std::vector<LL> empty_(n);
        result.push_back(empty_);
        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < n; k++)
            {
                result[i][j] = (result[i][j] + matrix1[i][k] * matrix2[k][j]) % MOD;
            }
        }
    }
    return result;
}

vector<int> e;
int ce;
LL B[240][240];
LL r[240][240];
LL rr[240][240];
LL BB[240][240];
vector<int> E[250];

void pot(int N)
{
    for (int i = 0; i < ce; i++)
        r[i][i] = 1;
    for (; N; N >>= 1)
    {
        if (N & 1)
        {
            for (int i = 0; i < ce; i++)
                for (int j = 0; j < ce; j++)
                {
                    rr[i][j] = 0;
                    for (int k = 0; k < ce; k++)
                        rr[i][j] = (rr[i][j] + r[i][k] * B[k][j]) % MOD;
                }
            memcpy(r, rr, sizeof r);
        }
        for (int i = 0; i < ce; i++)
            for (int j = 0; j < ce; j++)
            {
                BB[i][j] = 0;
                for (int k = 0; k < ce; k++)
                    BB[i][j] = (BB[i][j] + B[i][k] * B[k][j]) % MOD;
            }

        memcpy(B, BB, sizeof B);
    }
}

void gen(int pos)
{
    if (pos == fK.size())
    {
        vector<int> nn(e.begin(), e.end());
        E[ce] = nn;
        m[nn] = ce++;
    }
    else
    {
        for (int i = 0; i <= fK[pos].second; i++)
        {
            e[pos] = i;
            gen(pos + 1);
        }
    }
}

int main()
{
    cin >> N >> K >> L;

    fK = fact(K);
    if (fK.back().first > L)
        cout << 0;
    else
    {
        e = vector<int>(fK.size());
        gen(0);

        for (int i = 1; i <= L; i++)
        {
            vector<int> fL(fK.size(), 0);
            int ii = i;
            for (int j = 0; j < fK.size(); j++)
                while (ii % fK[j].first == 0)
                {
                    ii /= fK[j].first;
                    fL[j]++;
                }

            for (int j = 0; j < ce; j++)
            {
                vector<int> ne(fL.begin(), fL.end());
                for (int z = 0; z < fK.size(); z++)
                {
                    ne[z] += E[j][z];
                    if (ne[z] > fK[z].second)
                        ne[z] = fK[z].second;
                }
                int vec = m[ne];
                B[j][vec]++;
            }
        }

        pot(N);
        LL sol = r[0][ce - 1];
        cout << sol;
    }

    return 0;
}
