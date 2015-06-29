
#include<stdio.h>
#include<string.h>
const int len = 8;
int array[len][len];
int dp[len][len];
int i, j;

int max(int a,int b){
	return a > b ? a : b;
}

int main(){
	while(scanf("%d",&array[0][0]) != EOF){
		memset(dp, 0, sizeof(dp));
		for (i = 0; i < len; i++) {
			for (j = 0; j < len; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				scanf("%d",&array[i][j]);
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = array[i][j]; 
                }else if (i == 0) {
					dp[i][j] = dp[i][j-1] + array[i][j];
                }else if (j == 0) {
					dp[i][j] = dp[i-1][j] + array[i][j];
                }else {
					dp[i][j] = max(dp[i-1][j], dp[i][j-1])+array[i][j];
                }
			}
		}
		printf("%d\n", dp[7][7]);
	}
	return 0;
}

/**************************************************************
	Problem: 1529
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        