
// 题目1190：大整数排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1190
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17225519
 */

#include<iostream>
#include <string.h>
#include <string>
#include <algorithm>

using namespace std;
const int maxn = 102;
int i, n;
string array[maxn];

bool cmp(string s1, string s2) {
    if (s1.size() == s2.size()) {
        return s1 < s2;
    } else {
        return s1.size() < s2.size();
    }
}

int main() {
    while (cin >> n) {
        for (i = 0; i < n; i++) {
            cin >> array[i];
        }

        sort(array, array + n, cmp);
        for (i = 0; i < n; i++) {
            cout << array[i] << endl;
        }

    }
    return 0;
}
/**************************************************************
Problem: 1190
User: wangzhenqing
Language: C++
Result: Accepted
Time:20 ms
Memory:1528 kb
****************************************************************/


                        

