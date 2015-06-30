
// 题目1417：变型金刚

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年06月30日18:51:38
 * @url:http://ac.jobdu.com/problem.php?pid=1417
 */

#include<stdio.h>
#include<algorithm> 
#include <string.h>

using namespace std;
const int maxn = 105;
const int maxm = 10005;
char name[maxn][maxn];
int currNum;
int parent[maxn];
char s[maxn];
struct Node {
    int start;
    int end;
    int value;
} nodes[maxm];

int getIndex() {

    for (int i = 1; i < currNum; i++) {
        if (strcmp(name[i], s) == 0) {
            return i;
        }
    }
    return currNum;
}

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
    if (a == b) {
        return;
    }
    if (a > b) {
        parent[a] = b;
    } else {
        parent[b] = a;
    }
}

int main() {

    int n;
    int m;
    while (scanf("%d%d", &n, &m) != EOF) {
        int i = 0;
        currNum = 1;
        for (i = 0; i < m; i++) {
            scanf("%s", s);
            int a = getIndex();
            if (currNum == a) {
                strcpy(name[currNum++], s);
            }
            scanf("%s", s);
            int b = getIndex();
            if (currNum == b) {
                strcpy(name[currNum++], s);
            }
            nodes[i].start = a;
            nodes[i].end = b;
            scanf("%d", &nodes[i].value);
        }

        sort(nodes, nodes + m, compare);

        for (i = 1; i < maxn; i++) {
            parent[i] = i;
        }
        int maxLen = 0;
        int count = 0;
        bool flag = false;
        for (i = 0; i < m; i++) {
            if (findParent(nodes[i].start) != findParent(nodes[i].end)) {
                count++;
                unionTwo(nodes[i].start, nodes[i].end);
                maxLen = nodes[i].value;
                if (count == n - 1) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag || count == n - 1) {
            printf("%d\n", maxLen);
        } else {
            printf("%s\n", "My God");
        }

    }
    return 0;
}
/**************************************************************
Problem: 1417
User: wangzhenqing
Language: C++
Result: Accepted
Time:100 ms
Memory:1148 kb
****************************************************************/


                        

