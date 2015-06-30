
// 题目1527：首尾相连数组的最大子数组和

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1527
 */

import java.io.BufferedReader;
#include <stdio.h>

const int maxn = 100002;
int n, i;
int array[maxn];

int main() {
    while (scanf("%d", &n) != EOF) {
        scanf("%d", &array[0]);
        int sum = 0;
        sum += array[0];
        int maxValue = array[0] > 0 ? array[0] : 0;
        int minValue = array[0] < 0 ? array[0] : 0;
        int max = maxValue;
        int min = minValue;
        for (i = 1; i < n; i++) {
            scanf("%d", &array[i]);
            if (maxValue > 0) {
                maxValue += array[i];
            } else {
                maxValue = array[i];
            }
            if (minValue < 0) {
                minValue += array[i];
            } else {
                minValue = array[i];
            }
            max = maxValue > max ? maxValue : max;
            min = minValue < min ? minValue : min;
            sum += array[i];
        }
        int temp = sum - min;
        printf("%d\n", max > temp ? max : temp);
    }
    return 0;
}
/**************************************************************
Problem: 1527
User: wzqwsrf
Language: C++
Result: Accepted
Time:70 ms
Memory:1412 kb
****************************************************************/


                        

