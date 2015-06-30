
// 题目1017：还是畅通工程

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1017
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17165733
 */

#include<stdio.h>
#include<algorithm> 

const int maxn = 102;
const int maxm = 10002;
int parent[maxn];
using namespace std;
struct Node {
    int start;
    int end;
    int value;
} nodes[maxm];

int compare(Node node1, Node node2) {
    if (node1.value < node2.value) {
        return 1;
    }
    return 0;
}

int findParent(int f) {
    while (parent[f] != f) {
        f = parent[f];
    }
    return f;
}

void unionTwo(int f, int t) {
    int a = findParent(f);
    int b = findParent(t);
    if (a == b)
        return;
    if (a > b) {
        parent[a] = b;
    } else {
        parent[b] = a;
    }
}

int main() {

    int n;
    int m;
    while (scanf("%d", &n) != EOF) {
        if (n == 0) {
            break;
        }
        int i = 0;
        m = (n - 1) * n / 2;
        for (i = 0; i < m; i++) {
            scanf("%d%d%d", &nodes[i].start, &nodes[i].end, &nodes[i].value);
        }
        sort(nodes, nodes + m, compare);
        for (i = 1; i < n + 1; i++) {
            parent[i] = i;
        }
        int k = 0;
        int count = 0;
        for (i = 0; i < m; i++) {
            if (findParent(nodes[i].start) != findParent(nodes[i].end)) {
                unionTwo(nodes[i].start, nodes[i].end);
                k += nodes[i].value;
                count++;
                if (count == n - 1) {
                    break;
                }
            }
        }
        printf("%d\n", count < n - 1 ? -1 : k);
    }
    return 0;
}

/**************************************************************
Problem: 1017
User: wangzhenqing
Language: C++
Result: Accepted
Time:20 ms
Memory:1140 kb
****************************************************************/


                        

