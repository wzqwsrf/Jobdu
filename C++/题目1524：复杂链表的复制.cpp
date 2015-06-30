
// 题目1524：复杂链表的复制

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1524
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17308987
 */

#include <stdio.h>
#include <malloc.h>

const int maxn = 1002;
int array[maxn];
struct LinkedNode {
    int data;
    struct LinkedNode *next;
    struct LinkedNode *special;
};

int n, i;

int main() {
    LinkedNode *node, *tail, *p, *q;
    while (scanf("%d", &n) != EOF) {
        array[0] = 0;
        node = (LinkedNode *) malloc(sizeof(LinkedNode));
        node->next = NULL;
        tail = node;
        for (i = 0; i < n; i++) {
            int data;
            scanf("%d", &data);
            array[i + 1] = data;
            p = (LinkedNode *) malloc(sizeof(LinkedNode));
            p->data = data;
            tail->next = p;
            tail = p;
        }
        tail->next = NULL;
        p = node->next;
        for (i = 0; i < n; i++) {
            int data;
            scanf("%d", &data);
            q = (LinkedNode *) malloc(sizeof(LinkedNode));
            q->data = array[data];
            p->special = q;
            p = p->next;
        }
        node = node->next;
        for (i = 0; i < n; i++) {
            printf("%d %d\n", node->data, node->special->data);
            node = node->next;
        }

    }
    return 0;
}
/**************************************************************
Problem: 1524
User: wangzhenqing
Language: C++
Result: Accepted
Time:40 ms
Memory:1288 kb
****************************************************************/


                        

