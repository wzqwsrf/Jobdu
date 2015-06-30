
// 题目1167：数组排序

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:53
 * @url:http://ac.jobdu.com/problem.php?pid=1167
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/17224793
 */

#include <stdio.h>
#include <algorithm>
#include <map>

using namespace std;
const int maxn = 10002;
int i, n;
int array[maxn];
int newArray[maxn];
map<int, int> numMap;

int main() {
    while (scanf("%d", &n) != EOF) {
        for (i = 0; i < n; i++) {
            scanf("%d", &array[i]);
            newArray[i] = array[i];
        }
        sort(newArray, newArray + n);
        int index = 1;
        map<int, int>::iterator it;
        for (i = 0; i < n; i++) {
            it = numMap.find(newArray[i]);
            if (it == numMap.end()) {
                numMap.insert(make_pair(newArray[i], index));
                index++;
            }
        }
        for (i = 0; i < n - 1; i++) {
            printf("%d ", numMap.find(array[i])->second);
        }
        printf("%d\n", numMap.find(array[n - 1])->second);
    }
    return 0;
}
/**************************************************************
Problem: 1167
User: wangzhenqing
Language: C++
Result: Accepted
Time:20 ms
Memory:1504 kb
****************************************************************/


                        

