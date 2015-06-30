
// 题目1399：名侦探柯南

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 18:48:48
 * @url:http://ac.jobdu.com/problem.php?pid=1399
 */

#include<stdio.h>
#include<algorithm> 
#include<math.h>

const int maxn = 100002;
int parent[maxn];
using namespace std;
struct Jewel {
    int weight;
    int value;
} jewels[maxn];


bool compare(Jewel j1, Jewel j2) {
    long x = j1.value * j2.weight;
    long y = j1.weight * j2.value;
    return x > y;
}


int main() {

    int n;
    int c;
    while (scanf("%d%d", &n, &c) != EOF) {
        int i = 0;
        int weight;
        int value;
        for (i = 0; i < n; i++) {
            scanf("%d%d", &jewels[i].weight, &jewels[i].value);
        }
        sort(jewels, jewels + n, compare);
        double sum = 0;
        int k = 0;
        while (c) {
            if (c >= jewels[k].weight) {
                sum += jewels[k].value;
                c -= jewels[k].weight;
            } else {
                sum += (double) jewels[k].value / (double) jewels[k].weight * c;
                c = 0;
            }
            k++;
        }

        printf("%d\n", (int) (sum + 0.5));
    }

    return 0;
}

/**************************************************************
Problem: 1399
User: wzqwsrf
Language: C++
Result: Accepted
Time:390 ms
Memory:2192 kb
****************************************************************/


                        

