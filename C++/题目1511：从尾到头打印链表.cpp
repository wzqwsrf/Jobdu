
// 题目1511：从尾到头打印链表

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1511
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17302673
 */

#include <stdio.h>
#include <malloc.h>

struct LinkedNode {
    int data;
    struct LinkedNode *next;
};

int data, i;

void printfNode(LinkedNode *p) {
    if (p->next != NULL) {
        printfNode(p->next);
    }
    printf("%d\n", p->data);
}

int main() {
    LinkedNode *node, *tail, *p;
    node = (LinkedNode *) malloc(sizeof(LinkedNode));
    node->next = NULL;
    tail = node;
    while (scanf("%d", &data) != EOF) {
        if (data == -1) {
            break;
        }
        p = (LinkedNode *) malloc(sizeof(LinkedNode));
        p->data = data;
        tail->next = p;
        tail = p;
    }
    tail->next = NULL;
    printfNode(node->next);
    return 0;
}
/**************************************************************
Problem: 1511
User: wangzhenqing
Language: C++
Result: Accepted
Time:90 ms
Memory:5544 kb
****************************************************************/


                        

