
#include <stdio.h>
#include <string.h>
 
const int mod = 20123;
int len;
int i;
char array[1000];
int modValue(int n){
    return n % mod;
}
 
int calCount(int num) {
    int k = len - 1;
    int factor = 1;
    int count = 0;
    while (k >= 0) {
        int lowNum = 0;
        int currNum = 0;
        int highNum = 0;
        for (i = 0; i < k; i++) {
            highNum = modValue(modValue(highNum * 10) + (array[i] - '0'));
        }
        for (i = k+1; i < len; i++) {
            lowNum = modValue(modValue(lowNum * 10) + array[i] - '0');
        }
        currNum = array[k] - '0';
        if (currNum < num){
            count = modValue(count + highNum * factor);
        }else if (currNum == num) {
            count = modValue(count + highNum * factor + lowNum + 1);
        }else if (currNum > num) {
            count = modValue(count + (highNum + 1) * factor);
        }
              
        factor = modValue(factor * 10);
        k--;
    }
    return count;
}
 
int main(){
     
    while(scanf("%s",&array) != EOF){
        len = strlen(array);
        printf("%d\n",modValue(calCount(1) + calCount(2)));
    }
    return 0;
}
/**************************************************************
	Problem: 1491
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1020 kb
****************************************************************/


                        