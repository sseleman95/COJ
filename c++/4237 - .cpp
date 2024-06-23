#include <bits/stdc++.h>

using namespace std;

typedef unsigned long long ull;
typedef long long ll;
const int N = 1e6 + 10;
ll coun[N];
ll sum[N];
ll nums[N];

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        cin >> nums[i];
    }
    reverse(nums, nums + n);

    ll ans = 0;
    for (int i = 0; i < n; ++i)
    {
        if (i > 0)
            sum[i] = sum[i - 1];
        ll tsum = sum[i];
        ll sumB = coun[nums[i] - 1] * (nums[i] - 1) + coun[nums[i] + 1] * (nums[i] + 1) + coun[nums[i]] * (nums[i]);
        sum[i] += nums[i];
        coun[nums[i]]++;
        ll sot = (i + 1 - (coun[nums[i]] + coun[nums[i] - 1] + coun[nums[i] + 1]));
        ll cans = (tsum - sumB) - (sot * nums[i]);
        ans += cans;
    }
    cout << ans << endl;
    return 0;
}
