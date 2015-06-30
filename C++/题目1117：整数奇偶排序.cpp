
// 题目1117：整数奇偶排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1117
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17222485
 */

#include <stdio.h>
#include <string.h>
#include <algorithm>

using namespace std;
const int maxn = 12;
int arr1[maxn];
int arr2[maxn];
int i;

int main() {
    int num;
    int k1;
    int k2;
    while (scanf("%d", &num) != EOF) {
        memset(arr1, 0, sizeof(arr1));
        memset(arr2, 0, sizeof(arr2));
        k1 = 0;
        k2 = 0;
        if (num % 2 != 0) {
            arr1[k1] = num;
            k1++;
        } else {
            arr2[k2] = num;
            k2++;
        }
        for (i = 1; i < 10; i++) {
            scanf("%d", &num);
            if (num % 2 != 0) {
                arr1[k1] = num;
                k1++;
            } else {
                arr2[k2] = num;
                k2++;
            }
        }

        sort(arr1, arr1 + k1);
        sort(arr2, arr2 + k2);
        if (k1 != 0 && k2 != 0) {
            for (i = k1 - 1; i >= 0; i--) {
                printf("%d ", arr1[i]);
            }
            for (i = 0; i < k2 - 1; i++) {
                printf("%d ", arr2[i]);
            }
            printf("%d\n", arr2[k2 - 1]);
        } else if (k1 != 0) {
            for (i = k1 - 1; i > 0; i--) {
                printf("%d ", arr1[i]);
            }
            printf("%d\n", arr1[0]);
        } else {
            for (i = 0; i < k2 - 1; i++) {
                printf("%d ", arr2[i]);
            }
            printf("%d\n", arr2[k2 - 1]);
        }

    }
    return 0;
}
/**************************************************************
Problem: 1117
User: wangzhenqing
Language: C++
Result: Accepted
Time:40 ms
Memory:1020 kb
****************************************************************/


                        

