
#include <stdio.h>
const int maxn = 12;
int matrix[maxn][maxn];
int n,i,j;

int main(){
    while(scanf("%d",&n) != EOF){
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				scanf("%d",&matrix[i][j]);
			}
		}
		for (j = 0; j < n; j++) {
			int maxValue = matrix[j][j];
            int maxCol = j;
            for (i = j+1; i < n; i++) {
				if (matrix[i][j] > maxValue) {
					maxValue = matrix[i][j];
                    maxCol = i;
                }
            }
            for (i = 0; i < n; i++) {
				int temp = matrix[j][i];
                matrix[j][i] = matrix[maxCol][i];
                matrix[maxCol][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				printf("%d ",matrix[i][j]);
            }
			printf("%d",matrix[i][n-1]);
            printf("\n");
		}
    }
    return 0;
}

/**************************************************************
	Problem: 1470
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        