
#include <stdio.h>
#include <algorithm>
using namespace std;
const int maxn = 10002;
struct Job{
	int st;
	int ed;
	int val;
}jobs[maxn];
int dp[maxn];

int max(int x, int y){
	return x > y ? x : y;
}


bool cmp(const Job & a, const Job &b){
    return a.ed < b.ed;
}

int main(){
	int n;
	while(scanf("%d",&n) != EOF){
		int i;
		for(i = 1; i < n+1 ; i++){
			scanf("%d%d%d",&jobs[i].st,&jobs[i].ed,&jobs[i].val);
			dp[i] = 0;
		}
		sort(jobs+1,jobs+n+1,cmp);
		dp[0] = 0;
		for(i = 1; i < n+1; i++){
            int j; 
            for(j = i-1; j >0; j--){
                if(jobs[i].st >= jobs[j].ed){
                    break;
				}
            }
            dp[i] = max(dp[i-1],dp[j]+jobs[i].val);           
        }
		printf("%d\n",dp[n]);
	}
	return 0;
}
/**************************************************************
	Problem: 1499
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:250 ms
	Memory:1176 kb
****************************************************************/


                        