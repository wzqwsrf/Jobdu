
// 题目1202：排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1202
 */

import java.util.Arrays;
#include<stdio.h>

const int maxn = 102;
int array[maxn];
int n, i;

int sortUnit(int low, int high) {
    int key = array[low];
    while (low < high) {
        while (low < high && array[high] >= key) {
            high--;
        }
        array[low] = array[high];
        while (low < high && array[low] <= key) {
            low++;
        }
        array[high] = array[low];
    }
    array[high] = key;
    return high;
}

void sort(int low, int high) {
    if (low > high) {
        return;
    }
    int index = sortUnit(low, high);
    sort(low, index - 1);
    sort(index + 1, high);
}

int main() {
    while (scanf("%d", &n) != EOF) {
        for (i = 0; i < n; i++) {
            scanf("%d", &array[i]);
        }
        sort(0, n - 1);
        for (i = 0; i < n; i++) {
            printf("%d ", array[i]);
        }
        printf("\n");
    }
    return 0;
}
/**************************************************************
Problem: 1202
User: wangzhenqing
Language: C++
Result: Accepted
Time:30 ms
Memory:1020 kb
****************************************************************/


                        

