
// 题目1150：Counterfeit Dollar

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1150
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17339141
 */

#include <stdio.h>
#include <string.h>

int arrayA[13];
int arrayB[13];
char array[13] = "ABCDEFGHIJKL";
int n, i, j, k;

int abs(int x) {
    return x < 0 ? -x : x;
}

void initArray() {
    for (i = 0; i < 13; i++) {
        arrayA[i] = 0;
        arrayB[i] = 1;
    }
}

int main() {
    while (scanf("%d", &n) != EOF) {
        char left[15], right[15], result[15];
        for (i = 0; i < n; i++) {
            int num = 0;
            initArray();
            for (j = 0; j < 3; j++) {
                scanf("%s %s %s", left, right, result);
                int len1 = strlen(left);
                int len2 = strlen(right);
                if (strcmp(result, "even") == 0) {
                    for (k = 0; k < len1; k++) {
                        arrayB[left[k] - 'A'] = 0;
                    }
                    for (k = 0; k < len2; k++) {
                        arrayB[right[k] - 'A'] = 0;
                    }
                } else if (strcmp(result, "up") == 0) {
                    num++;
                    for (k = 0; k < len1; k++) {
                        arrayA[left[k] - 'A']--;
                    }
                    for (k = 0; k < len2; k++) {
                        arrayA[right[k] - 'A']++;
                    }
                } else if (strcmp(result, "down") == 0) {
                    num++;
                    for (k = 0; k < len1; k++) {
                        arrayA[left[k] - 'A']++;
                    }
                    for (k = 0; k < len2; k++) {
                        arrayA[right[k] - 'A']--;
                    }
                }
            }
            int maxId = 0;
            for (j = 0; j < 13; j++) {
                if (arrayB[j] == 1 && abs(arrayA[j]) == num) {
                    maxId = j;
                }
            }
            char c = array[maxId];
            if (arrayA[maxId] < 0) {
                printf("%c is the counterfeit coin and it is heavy.\n", c);
            } else {
                printf("%c is the counterfeit coin and it is light.\n", c);
            }
        }
    }
    return 0;
}
/**************************************************************
Problem: 1150
User: wangzhenqing
Language: C++
Result: Accepted
Time:0 ms
Memory:1020 kb
****************************************************************/


                        

