
// 题目1061：成绩排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:52
 * @url:http://ac.jobdu.com/problem.php?pid=1061
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17219925
 */

#include <stdio.h>
#include <algorithm>
#include<string.h>

using namespace std;
const int maxn = 1002;

struct Student {
    char name[102];
    int age;
    int score;
} students[maxn];

int n, c, i;

bool cmp(Student s1, Student s2) {
    if (s1.score == s2.score) {
        int tmp = strcmp(s1.name, s2.name);
        if (tmp == 0) {
            return s1.age < s2.age;
        } else {
            return tmp < 0;
        }
    } else {
        return s1.score < s2.score;
    }
}

int main() {
    while (scanf("%d", &n) != EOF) {
        for (i = 0; i < n; i++) {
            scanf("%s %d %d", &students[i].name, &students[i].age, &students[i].score);
        }
        sort(students, students + n, cmp);
        for (i = 0; i < n; i++) {
            printf("%s %d %d\n", students[i].name, students[i].age, students[i].score);
        }
    }
    return 0;
}

/**************************************************************
Problem: 1061
User: wangzhenqing
Language: C++
Result: Accepted
Time:90 ms
Memory:1144 kb
****************************************************************/


                        

