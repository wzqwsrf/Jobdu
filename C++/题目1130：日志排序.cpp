

// 题目1130：日志排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1130
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17231811
 */
#include <iostream>
#include<stdio.h>
#include<string.h>
#include<string>
#include<algorithm>

using namespace std;
const int maxn = 10002;
struct Task {
    char allMsg[200];
    char name[12];
    char startFir[15];
    char startSec[15];
    char wasteTime[15];
} tasks[maxn];

bool cmp(Task t1, Task t2) {
    int len1 = strlen(t1.wasteTime);
    int len2 = strlen(t2.wasteTime);
    if (len1 != len2) {
        return len1 < len2;
    } else {
        int tmp = strcmp(t1.wasteTime, t2.wasteTime);
        if (tmp != 0) {
            return tmp < 0;
        } else {
            tmp = strcmp(t1.startFir, t2.startFir);
            if (tmp != 0) {
                return tmp < 0;
            } else {
                return strcmp(t1.startSec, t2.startSec) < 0;
            }
        }
    }
}

int main() {
    int k = 0;
    while (gets(tasks[k].allMsg)) {
        sscanf(tasks[k].allMsg, "%s%s%s%s", tasks[k].name, tasks[k].startFir, tasks[k].startSec, tasks[k].wasteTime);
        k++;
    }
    sort(tasks, tasks + k, cmp);
    for (int i = 0; i < k; i++) {
        cout << tasks[i].allMsg << endl;
    }
    return 0;
}
/**************************************************************
Problem: 1130
User: wangzhenqing
Language: C++
Result: Accepted
Time:130 ms
Memory:4040 kb
****************************************************************/


                        

