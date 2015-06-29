
#include <stdio.h>
 
int max(int x, int y){
    return x > y ? x : y;
}
 
int min(int x, int y){
    return x < y ? x : y;
}
 
int calCount(int n){
    int iCount = 0;
    int iFactor = 1;
    int iLowerNum = 0;
    int iHigherNum = 0;
    int iCurrNum = 0;
    while((n / iFactor) != 0){
        iLowerNum = n % iFactor;
        iCurrNum = (n / iFactor) % 10;
        iHigherNum = n / (iFactor * 10);
        switch (iCurrNum){
            case 0:
                iCount += iHigherNum * iFactor;
                break;
            case 1:
                iCount += iHigherNum * iFactor + iLowerNum + 1;
                break;
            default:
                iCount += (iHigherNum + 1) * iFactor;
                break;
        }
        iFactor *= 10;
    }
    return iCount;
}
 
 
int main(){
    int a, b;
    while(scanf("%d%d",&a,&b) != EOF){
        if(a == 0 && b == 0){
            printf("%d\n",0);
        }else if(a == 0 || b == 0){
            printf("%d\n",calCount(max(a,b)));
        }else {
            int newA = min(a,b);
            int newB = max(a,b);
            int count1 = calCount(newA - 1);
            int count2 = calCount(newB);
            printf("%d\n",count2 - count1);
        }
    }
    return 0;
}
/**************************************************************
	Problem: 1373
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        