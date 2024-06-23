#include <bits/stdc++.h>

using namespace std;

int ap[1001];
int isMultCub[1001];
int primes[11] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

bool isCub(int a, int b) {
    for (int i = 0; i < 11; i++) {
        int prime = primes[i];
        if(a % (prime * prime) == 0 && b % prime == 0) return true;
        if(b % (prime * prime) == 0 && a % prime == 0) return true;
    }
    return false;
}
vector<int> nums;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin >> n;
    int maxN = 0;
    for (int i = 0; i < n; ++i) {
        int ac;
        cin >> ac;
        if(ap[ac] == 0) {
            nums.push_back(ac);
        }
        ap[ac]++;
        maxN = max(maxN, ac);
    }

    for (int i = 2; i <= 10; i++) {
        for (int j = 1; j * i * i * i <= 1000; ++j) {
            isMultCub[i * i * i * j] = true;
        }
    }


    long long ans = 0;
    for (int i : nums) {
        for (int j : nums) {
            if (ap[i] && i == j) {
                if(isMultCub[i]) {
                    ans += ((long long)ap[i]) * (ap[i] - 1);
                } else if (isCub(i, i)) {
                    ans += ((long long)ap[i]) * (ap[i] - 1);
                }
            } else if (ap[i] && ap[j]) {
                if(isMultCub[i] || isMultCub[j]) {
                    ans += ((long long)ap[i]) * ap[j];
                } else if (isCub(i, j)){
                    ans += ((long long)ap[i]) * ap[j];
                }
            }
        }
    }
    cout << ans / 2 << endl;

    return 0;
}
