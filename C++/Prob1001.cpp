
// 题目1001：A+B for Matrices

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日17:32:32
 * @url：http://ac.jobdu.com/problem.php?pid=1001
 * 矩阵相加，求整行和整列为0的行列数。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/37882211
 */

#include <stdio.h>
const int max = 102;
int matrix[max][max];
int m, n;
int i, j;
int main(){
    while(scanf("%d", &m) != EOF){
        if(m == 0){
            break;
        }
        scanf("%d", &n);
        for(i = 0 ; i < m; i++){
            for(j = 0; j < n; j++){
                scanf("%d", &matrix[i][j]);
            }
        }
        
        for(i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                int tempNum;
                scanf("%d", &tempNum);
                matrix[i][j] += tempNum;
            }
        }
        int zeroNum = 0;
        for (i = 0; i < m; i++) {
            bool isZero = true;
            for (j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                zeroNum++;
            }
        }
        for (j = 0; j < n; j++) {
            bool isZero = true;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                zeroNum++;
            }
        }
        printf("%d\n", zeroNum);
    }
    return 0;
}
/**************************************************************
 Problem: 1001
 User: wangzhenqing
 Language: C++
 Result: Accepted
 Time:0 ms
 Memory:1060 kb
 ****************************************************************/