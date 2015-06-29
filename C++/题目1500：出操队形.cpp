
#include <stdio.h>
const int maxn = 1000002;
int dp[maxn];

int binSearch(int key, int low, int high) {
	while (low <= high) {
		int mid = (low + high) >> 1;
        if (key > dp[mid]) {
			low = mid + 1;
        }else{
			high = mid - 1;
		}
	}
    return low ;
}

int main(){
	int n;
	while(scanf("%d",&n)!=EOF){
		int *array = new int[n+1];
		int i;
		int j;
		for(i = 1; i < n+1 ; i++){
			scanf("%d",&array[i]);
		}
		int *newDP1 = new int[n+1];
		int *newDP2 = new int[n+1];
        newDP1[1] = 1;
        dp[1] = array[1];
        int len = 1;
		j = 1;
        for ( i = 2; i < n+1; i++) {
            if (dp[len] < array[i]) {
				len++;
                j = len;
            }else {
				j = binSearch(array[i] , 1 , len);
            }
            dp[j] = array[i];
            newDP1[i] = len;
        }
             
		dp[1] = array[n];
        len = 1;
        j = 1;
        for ( i = n-1; i >= 1; i--) {
            if (dp[len] < array[i]) {
				len++;
                j = len;
            }else {
				j = binSearch(array[i] , 1 , len);
            }
            dp[j] = array[i];
            newDP2[n-i+1] = len;
		}

        int res = 0;
        for ( i = 1; i < n+1; i++) {
			int sum = newDP1[i] + newDP2[n-i+1];
            if ( sum > res) {
				res = sum;
            }
		}

		res = res != 0 ? (n - res + 1) : 0;
		printf("%d\n",res);
	}
	return 0;
}
/**************************************************************
	Problem: 1500
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:980 ms
	Memory:28380 kb
****************************************************************/


                        