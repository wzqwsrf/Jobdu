
#include <stdio.h>
#include <string.h>
const int maxn = 102;
const int maxLen = 10;
int numArr[maxLen];
int dp[maxn];
int a, b;
int i, j;
int count;

int max(int x, int y){
	return x > y ? x : y;
}
bool isTrue(int num){
	int tempSum = 0;
	int len = 0;
	int k = 0;
	while(num){
		numArr[k] = num % 10;
		tempSum += numArr[k];
		num /= 10;
		k++;
	}
	len = k;
	if(tempSum % 2 != 0){
		return false;
	}
	int midSum = tempSum / 2;
	for (j = 0; j < len; j++) {
        for (k = midSum; k >= numArr[j]; k--) {
			dp[k] = max(dp[k], dp[k - numArr[j]] + numArr[j]);
        }
    }
    if (dp[midSum] == midSum) {
		return true;
	}
	return false;
}
int main(){
	while(scanf("%d %d", &a, &b) != EOF){
		count = 0;
		a = max(11, a);
		for(i = a; i <= b; i++){
			memset(dp, 0, sizeof(dp));
			if(isTrue(i)){
				count++;
			}
		}
		printf("%d\n", count);
	}
	return 0;
}
/**************************************************************
	Problem: 1358
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:160 ms
	Memory:1020 kb
****************************************************************/


                        