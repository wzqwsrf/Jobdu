
#include <stdio.h>
#include <string.h>
const int maxn = 1002;
long dp[maxn];
 
int main(){
	int mod = 1000000007;
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;
    dp[4] = 7;
    for (int i = 5; i <= 1000; i++) {
		dp[i] = (dp[i-1] + dp[i-2] + dp[i-4]) % mod;
    }
    int n;
    while(scanf("%d",&n)!=EOF){
        printf("%d\n", dp[n]);
    }
    return 0;
}

/**************************************************************
	Problem: 1552
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1028 kb
****************************************************************/


                        