
// 题目1120：全排列

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1120
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/18735245
 */

#include <stdio.h>
#include <string>

using namespace std;
string array;
int len;

void swap(int a, int b) {
    char temp = array[b];
    array[b] = array[a];
    array[a] = temp;
}

void reverse(int a, int b) {
    while (a < b) {
        swap(a, b);
        a++;
        b--;
    }
}

void permutation() {

    int i, j;
    while (true) {
        printf("%s\n", array.c_str());
        for (i = len - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) {
                break;
            }
            if (i == 0) {
                return;
            }
        }
        for (j = len - 1; j > i; j--) {
            if (array[j] > array[i]) {
                break;
            }
        }

        swap(i, j);
        reverse(i + 1, len - 1);
    }
}


int main() {

    char data[10];
    while (scanf("%s", &data) != EOF) {
        array = data;
        len = array.size();
        if (len == 1) {
            printf("%s\n", array.c_str());
            printf("\n");
            continue;
        }
        permutation();
        printf("\n");
    }

    return 0;
}
/**************************************************************
Problem: 1120
User: wzqwsrf
Language: C++
Result: Accepted
Time:370 ms
Memory:1052 kb
****************************************************************/


                        

