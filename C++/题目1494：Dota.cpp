
#include <stdio.h>
#include <string.h>
const int maxn = 202;
const int maxg = 1002;
int p[maxn];
int v[maxn];
int dp[maxg];
int n, m, g, s;
int i, j, t;

int max(int a, int b){
	return a > b ? a : b;
}

int main(){
    while(scanf("%d %d %d", &n, &m, &g) != EOF){
		memset(dp, 0, sizeof(dp));
		memset(p, 0, sizeof(p));
		memset(v, 0, sizeof(v));
		for (i = 1; i < n + 1; i++) {
			scanf("%d", &p[i]);
			scanf("%d", &v[i]);	
		}
		int size = n + m + 1;
		for (i = n + 1; i < size; i++) {
			scanf("%d", &t);	
			for (j = 1; j < t + 1; j++) {
				int seq;
				scanf("%d", &seq);
				p[i] += p[seq];
				v[i] += v[seq];
			}				
			scanf("%d", &s);
			v[i] += s;
		}
		for (i = 1; i < size; i++) {
			for (j = p[i]; j <= g; j++) {
				dp[j] = max(dp[j], dp[j - p[i]] + v[i]);
			}
		}
		printf("%d\n", dp[g]);
	}
    return 0;
}
/**************************************************************
	Problem: 1494
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:20 ms
	Memory:1028 kb
****************************************************************/


                        