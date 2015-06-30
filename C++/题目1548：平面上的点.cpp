
// 题目1548：平面上的点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1548
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19914971
 */

#include <stdio.h>

const int maxn = 102;
struct Node {
    int x;
    int y;
};
int n, i;
Node nodes[maxn];

int max(int a, int b) {
    return a > b ? a : b;
}

int main() {
    while (scanf("%d", &n) != EOF) {
        for (i = 0; i < n; i++) {
            scanf("%d %d", &nodes[i].x, &nodes[i].y);
        }
        if (n == 0 || n == 1 || n == 2) {
            printf("%d\n", n);
            continue;
        }
        int maxNum = 0;
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tempNum = 2;
                while (j < n && nodes[j].x == nodes[i].x && nodes[j].y == nodes[i].y) {
                    tempNum++;
                    j++;
                }
                if (j == n) {
                    tempNum--;
                }
                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) {
                        continue;
                    }
                    int num1 = (nodes[k].y - nodes[i].y) * (nodes[j].x - nodes[i].x);
                    int num2 = (nodes[j].y - nodes[i].y) * (nodes[k].x - nodes[i].x);
                    if (num1 == num2) {
                        tempNum++;
                    }
                }
                maxNum = max(tempNum, maxNum);
            }
        }
        printf("%d\n", maxNum);
    }
    return 0;
}

/**************************************************************
Problem: 1548
User: wangzhenqing
Language: C++
Result: Accepted
Time:40 ms
Memory:1020 kb
****************************************************************/


                        

