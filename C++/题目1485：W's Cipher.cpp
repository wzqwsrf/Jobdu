
// 题目1485：W's Cipher

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:55
 * @url:http://ac.jobdu.com/problem.php?pid=1485
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17614527
 */

#include <stdio.h>
#include <string>
#include <string.h>

using namespace std;
const int maxn = 82;
char s1[maxn], s2[maxn];
int array1[maxn], array2[maxn], array3[maxn];

int main() {

    int i, size1, size2, size3;
    int k1, k2, k3;
    while (scanf("%d%d%d", &k1, &k2, &k3) != EOF) {
        if (k1 == 0 && k2 == 0 && k3 == 0) {
            break;
        }
        scanf("%s1", s1);
        size1 = 0;
        size2 = 0;
        size3 = 0;
        int len = strlen(s1);
        for (i = 0; i < len; i++) {
            if (s1[i] >= 'a' && s1[i] <= 'i') {
                array1[size1] = i;
                size1++;
            } else if (s1[i] >= 'j' && s1[i] <= 'r') {
                array2[size2] = i;
                size2++;
            } else if ((s1[i] >= 's' && s1[i] <= 'z') || s1[i] == '_') {
                array3[size3] = i;
                size3++;
            }
        }
        for (i = 0; i < size1; i++) {
            s2[array1[(i + k1) % size1]] = s1[array1[i]];
        }
        for (i = 0; i < size2; i++) {
            s2[array2[(i + k2) % size2]] = s1[array2[i]];
        }
        for (i = 0; i < size3; i++) {
            s2[array3[(i + k3) % size3]] = s1[array3[i]];
        }
        for (i = 0; i < len; i++) {
            printf("%c", s2[i]);
        }
        printf("\n");
    }
    return 0;
}

/**************************************************************
Problem: 1485
User: wangzhenqing
Language: C++
Result: Accepted
Time:0 ms
Memory:1020 kb
****************************************************************/


                        

