
// 题目1505：两个链表的第一个公共结点

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1505
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17285483
 */

#include <stdio.h>
#include <malloc.h>

struct LinkedNode {
    int data;
    struct LinkedNode *next;
};

int n, m, i;

int main() {
    LinkedNode *nodeA, *nodeB, *tail, *p, *q;
    while (scanf("%d%d", &m, &n) != EOF) {
        nodeA = (LinkedNode *) malloc(sizeof(LinkedNode));
        nodeA->next = NULL;
        tail = nodeA;
        for (i = 0; i < m; i++) {
            int data;
            scanf("%d", &data);
            p = (LinkedNode *) malloc(sizeof(LinkedNode));
            p->data = data;
            tail->next = p;
            tail = p;
        }
        tail->next = NULL;

        nodeB = (LinkedNode *) malloc(sizeof(LinkedNode));
        nodeB->next = NULL;
        tail = nodeB;
        for (i = 0; i < n; i++) {
            int data;
            scanf("%d", &data);
            p = (LinkedNode *) malloc(sizeof(LinkedNode));
            p->data = data;
            tail->next = p;
            tail = p;
        }
        tail->next = NULL;


        p = nodeA->next;
        q = nodeB->next;
        int k = 0;
        if (m > n) {
            while (k < m - n) {
                p = p->next;
                k++;
            }
        } else if (m < n) {
            k = 0;
            while (k < n - m) {
                q = q->next;
                k++;
            }
        }
        int result;
        bool flag = false;
        while (p != NULL && q != NULL) {
            int num1 = p->data;
            int num2 = q->data;
            if (num1 == num2) {
                result = num1;
                flag = true;
                break;
            }
            p = p->next;
            q = q->next;
        }

        if (p != NULL) {
            flag = true;
            result = p->data;
        }
        if (!flag) {
            printf("%s\n", "My God");
        } else {
            printf("%d\n", result);
        }
    }
    return 0;
}
/**************************************************************
Problem: 1505
User: wangzhenqing
Language: C++
Result: Accepted
Time:70 ms
Memory:3924 kb
****************************************************************/


                        

