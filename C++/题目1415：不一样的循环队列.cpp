
// 题目1415：不一样的循环队列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1415
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17266757
 */

#include <stdio.h>
#include <string>
#include <string.h>

using namespace std;
#define INF 10000000;
const int maxm = 100002;
struct QueueLoop {
    int array[maxm];
    int front;
    int rear;
};
QueueLoop queue;
int n, m, i;
int len;

bool IsEmpty() {
    int front = queue.front;
    int rear = queue.rear;
    if (rear == front) {
        return true;
    }
    return false;
}

bool Isfull() {
    int front = queue.front;
    int rear = queue.rear;
    if ((rear + 1) % len == front) {
        return true;
    }
    return false;
}

bool pushElement(int k) {
    if (Isfull()) {
        return false;
    }
    int rear = queue.rear;
    queue.array[rear] = k;
    queue.rear = (rear + 1) % len;
    return true;
}

bool popElement() {
    if (IsEmpty()) {
        return false;
    }
    int front = queue.front;
    queue.front = (front + 1) % len;
    return true;
}

void queryElement(int k) {
    int front = queue.front;
    int rear = queue.rear;
    if (k <= 0 || rear - front < k) {
        printf("failed\n");
    } else {
        printf("%d\n", queue.array[k + front - 1]);
    }
}

int main() {
    while (scanf("%d%d", &n, &m) != EOF) {
        queue.front = 0;
        queue.rear = 0;
        len = m + 1;
        char operate[15];
        for (i = 0; i < n; i++) {
            scanf("%s", operate);
            if (strcmp(operate, "Push") == 0) {
                int k;
                scanf("%d", &k);
                if (!pushElement(k)) {
                    printf("failed\n");
                }
            } else if (strcmp(operate, "Pop") == 0) {
                if (!popElement()) {
                    printf("failed\n");
                }
            } else if (strcmp(operate, "Query") == 0) {
                int k;
                scanf("%d", &k);
                queryElement(k);
            } else if (strcmp(operate, "Isempty") == 0) {
                printf("%s\n", IsEmpty() == true ? "yes" : "no");
            } else {
                printf("%s\n", Isfull() == true ? "yes" : "no");
            }
        }
    }
    return 0;
}
/**************************************************************
Problem: 1415
User: wangzhenqing
Language: C++
Result: Accepted
Time:130 ms
Memory:1412 kb
****************************************************************/


                        

