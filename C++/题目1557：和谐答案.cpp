
#include <stdio.h>
const int size = 5;
int n,i,j;
int array[size];
int posArr[size];
int colNum;

int searchPosition(int *dp, int low, int high, int target) {
	int mid = 0;
	while (low <= high) {
		mid = (low + high) >> 1;
		if(dp[mid] == target){
			return mid;
		}
		if(dp[mid] > target){
			high = mid - 1;
		}else {
			low = mid + 1;
		}
	}
	return low;
}

int main(){
	while(scanf("%d",&n) != EOF){
		int *dp = new int[n];
		for(i = 0; i < n; i++){
			dp[i] = 10000000;
		}
		int low = 0;
		int high = 0;
		for(i = 0; i < n; i++){
			scanf("%d",&colNum);
			for(j = 0; j < colNum; j++){
				scanf("%d",&array[j]);
				posArr[j] = searchPosition(dp, low, high, array[j]);
			}
			for (j = 0; j < colNum; j++) {
				dp[posArr[j]] = dp[posArr[j]] < array[j] ? dp[posArr[j]] : array[j];
				high = high > posArr[j] + 1 ? high : posArr[j] + 1;
			}
		}
		printf("%d\n",high);
	}
	return 0;
}

/**************************************************************
	Problem: 1557
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:1400 ms
	Memory:2584 kb
****************************************************************/


                        