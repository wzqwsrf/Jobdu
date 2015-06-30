
// 题目1135：字符串排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1135
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17224333
 */

#include <iostream>
#include <string.h>
#include <string>
#include <algorithm>

using namespace std;
int i, n;

bool cmp(string s1, string s2) {
    return s1.length() < s2.length();
}

int main() {
    string s;
    while (cin >> n) {
        cin.ignore();
        string *array = new string[n];
        for (i = 0; i < n; i++) {
            getline(cin, s);
            if (s == "stop") {
                break;
            }
            array[i] = s;
        }
        sort(array, array + i, cmp);
        n = i;
        for (i = 0; i < n; i++) {
            cout << array[i] << endl;
        }
    }
    return 0;
}
/**************************************************************
Problem: 1135
User: wangzhenqing
Language: C++
Result: Accepted
Time:10 ms
Memory:1528 kb
****************************************************************/


                        

