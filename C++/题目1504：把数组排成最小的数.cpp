
// 题目1504：把数组排成最小的数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1504
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/25896905
 */

#include<stdio.h>
#include<algorithm>
#include<string.h>

using namespace std;
const int maxn = 102;
int n, i;

struct Node {
    char num[20];
} nodes[102];

bool cmp(Node node1, Node node2) {
    char c[20];
    strcpy(c, node1.num);
    strcat(node1.num, node2.num);
    strcat(node2.num, c);
    return strcmp(node1.num, node2.num) < 0;
}

int main() {
    int n;
    while (scanf("%d", &n) != EOF) {
        for (i = 0; i < n; i++) {
            scanf("%s", nodes[i].num);
        }
        sort(nodes, nodes + n, cmp);
        for (i = 0; i < n; i++) {
            printf("%s", nodes[i].num);
        }
        printf("\n");
    }
    return 0;
}
/**************************************************************
Problem: 1504
User: wangzhenqing
Language: C++
Result: Accepted
Time:80 ms
Memory:1028 kb
****************************************************************/


                        

