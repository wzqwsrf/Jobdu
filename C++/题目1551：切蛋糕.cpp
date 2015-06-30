
// 题目1551：切蛋糕

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1551
 */

import java.io.BufferedReader;
#include <stdio.h>
#include <math.h>

#define PI 3.1415926

double countArea(double R, double mid) {
    double du = asin(mid / (2 * R));
    double l = R * R * du - 0.5 * mid * sqrt(R * R - 0.25 * mid * mid);
    double r = R * R * PI - l;
    return l / r;
}

int main() {
    int R;
    double r;
    while (scanf("%d%lf", &R, &r) != EOF) {
        double low = 0.0;
        double high = 2 * R;
        double mid = 0;
        while ((high - low) >= 0.0001) {
            mid = (low + high) / 2;
            if (countArea(R, mid) > r) {
                high = mid;
            } else {
                low = mid;
            }
        }
        printf("%.2lf\n", mid);
    }
    return 0;
}

/**************************************************************
Problem: 1551
User: wzqwsrf
Language: C++
Result: Accepted
Time:0 ms
Memory:1100 kb
****************************************************************/


                        

