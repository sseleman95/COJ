#include <iostream>
#include <string>
#include <utility>
#include <algorithm>
#include <unordered_map>
#include <cmath>
#include <cstdio>
#include <cctype>
#include <cstdint>
#include <iomanip>

using namespace std;

void primeFactors(int n)
{
    while (n % 2 == 0)
    {
        printf("%d ", 2);
        n = n / 2;
    }

    for (int i = 3; i <= sqrt(n); i = i + 2)
    {
        while (n % i == 0)
        {
            printf("%d ", i);
            n = n / i;
        }
    }

    if (n > 2)
        printf("%d ", n);
}

int findMaxPrimeFactor(int n)
{
    int maxFactor = 0;
    while (n % 2 == 0)
    {
        n = n / 2;
        maxFactor = 2;
    }

    int sqrtn = static_cast<int>(sqrt(n));
    for (int i = 3; i <= sqrtn; i = i + 2)
    {
        while (n % i == 0)
        {
            n = n / i;
            maxFactor = i;
        }
    }

    if (n > 2)
    {
        maxFactor = n;
    }
    return maxFactor;
}

int main()
{
    std::ios::sync_with_stdio(false);
    cin.tie(NULL);

    int N, num;
    cin >> N;
    cin.ignore();
    int maxFactor = -1, numberWithMaxFactor = -1;
    for (; N--;)
    {
        cin >> num;
        cin.ignore();
        int greaterFactor = findMaxPrimeFactor(num);
        if (greaterFactor > maxFactor)
        {
            maxFactor = greaterFactor;
            numberWithMaxFactor = num;
        }
    }
    cout << numberWithMaxFactor << endl;
    return 0;
}