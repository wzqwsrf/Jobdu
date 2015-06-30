
// 题目1518：反转链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1518
 */

import java.io.BufferedReader;
#include <stdio.h>
#include <malloc.h>

struct LinkedNode {
    int data;
    struct LinkedNode *next;
};

int n, i;

int main() {
    LinkedNode *node, *tail, *p, *q;
    while (scanf("%d", &n) != EOF) {
        if (n == 0) {
            printf("NULL\n");
            continue;
        }
        node = (LinkedNode *) malloc(sizeof(LinkedNode));
        node->next = NULL;
        tail = node;
        for (i = 0; i < n; i++) {
            int data;
            scanf("%d", &data);
            p = (LinkedNode *) malloc(sizeof(LinkedNode));
            p->data = data;
            tail->next = p;
            tail = p;
        }
        tail->next = NULL;
        p = node->next;
        tail = NULL;
        while (p != NULL) {
            q = p->next;
            p->next = tail;
            tail = p;
            p = q;
        }
        p = tail;
        for (i = 0; i < n; i++) {
            if (i == n - 1) {
                printf("%d\n", p->data);
            } else {
                printf("%d ", p->data);
                p = p->next;
            }
        }
    }
    return 0;
}
/**************************************************************
Problem: 1518
User: wangzhenqing
Language: C++
Result: Accepted
Time:150 ms
Memory:2472 kb
****************************************************************/


                        

