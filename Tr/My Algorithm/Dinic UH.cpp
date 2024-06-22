namespace MF
{
	const int MAXV = 5005, MAXE=60005, oo=0x3f3f3f3f;
	int E, N, M, u, v, c, last[MAXV], next[MAXE], adj[MAXE], level[MAXV], now[MAXV], Q[MAXV],source, sink;
	ll cap[MAXE], flow[MAXE];
	
	void add_edge(int u, int v, int c) {
		cap[E] = c, flow[E] = 0, adj[E] = v, next[E] = last[u], last[u] = E++;
		cap[E] = 0, flow[E] = 0, adj[E] = u, next[E] = last[v], last[v] = E++;
	}
	#define RES(e) (cap[e]-flow[e])
	bool bfs(int s, int t) {
		memset(level, -1, sizeof level);
		level[s] = 0;
		Q[0] = s;
		for (int ql = 0, qr=1; ql<qr && level[t] == -1; ++ql) {
			int u = Q[ql];
			for (int e = last[u]; e != -1; e = next[e]) {
				int v = adj[e];
				if (level[v] == -1 && RES(e) > 0) {
					level[v] = level[u]+1;
					Q[qr++] = v;
				}
			}
		}
		return level[t] != -1;
	}
	ll dfs(int u, ll curr) {
		if (u == sink)
			return curr;
		for (int e = now[u]; e != -1; now[u] = e = next[e]) {
			int v = adj[e];
			if (level[v] == level[u]+1 && RES(e)>0) {
				ll ans = dfs(v, min(curr, RES(e)));
				if (ans > 0) {
					flow[e] += ans;
					flow[e^1] -= ans;
					return ans;
				}
			}
		}
		return 0;
	}
	ll max_flow() {
		ll ans = 0, res;
		while (bfs(source, sink)) {
			memcpy(now, last, sizeof now);
			while((res=dfs(source, oo)) > 0)
				ans += res;
		}
		return ans;
	}
	
	void init(int _source , int _sink){
		source = _source;
		sink = _sink;
		memset(last , -1 , sizeof last);
		E = 0;
	}
}