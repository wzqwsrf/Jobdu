
// 题目1392：排序生成最小的数

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:54
 * @url:http://ac.jobdu.com/problem.php?pid=1392
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17229455
 */

#include <iostream>
#include <algorithm>
#include <string>

const int maxn = 102;
using namespace std;
int n, i;
string array[maxn];

bool cmp(string s1, string s2) {
    return (s1 + s2) < (s2 + s1);
}

int main() {

    while (cin >> n) {
        for (i = 0; i < n; i++) {
            cin >> array[i];
        }
        sort(array, array + n, cmp);
        string result = "";
        for (i = 0; i < n; i++) {
            result += array[i];
        }
        cout << result << endl;
    }
    return 0;
}
/**************************************************************
Problem: 1392
User: wangzhenqing
Language: C++
Result: Accepted
Time:180 ms
Memory:1528 kb
****************************************************************/


                        

