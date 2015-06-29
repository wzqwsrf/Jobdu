
#include <stdio.h>
const int maxn = 32;
int n,i;
double q;
int numArr[32];
int max(int a, int b){
	return a > b ? a : b;
}
int main(){
	while(scanf("%lf %d",&q,&n) != EOF){
		if(n == 0){
			break;
		}
		int len = 0;
		while (n > 0) {
			double A = 0;
            double B = 0;
            double C = 0;
			double price;
            int valid = 0;
			char c;
            int m;
			scanf("%d",&m);
            while (m > 0) {
				getchar();
                scanf("%c:%lf", &c, &price);
                if (c == 'A') {
					A += price;
                }else if (c == 'B') {
					B += price;
                }else if (c == 'C') {
					C += price;
                }else {
					valid = 1;
                }
                m--;
            }  
            if (valid == 0 && A <= 600.00 && B <= 600.00 && C <= 600.00) {
				double total = A + B + C;
                if (total <= 1000.00 && total <= q) {
					numArr[len] = (int)(total*100);
					len++;
                }
            }
            n--;
		}
		int hunq = (int) (q * 100);
		int *dp = new int[hunq + 1];
		for(i = 0; i < hunq+1; i++){
			dp[i] = 0;
		}
		for (i = 0; i < len; i++) {
			int tempNum = numArr[i];
			for (int j = hunq; j >= tempNum; j--) {
				dp[j] = max(dp[j], dp[j - tempNum] + tempNum );
			}
		}
		double res = (double)(dp[hunq]/100.00);
		printf("%.2lf\n",res);
	}
	return 0;
}
/**************************************************************
	Problem: 1025
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:30 ms
	Memory:21816 kb
****************************************************************/


                        