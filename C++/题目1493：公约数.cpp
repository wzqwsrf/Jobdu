
#include <stdio.h>
int a,b;

int gcd(int x, int y){
	int temp;
	while(y > 0){
		temp = x % y;
		x = y;
		y = temp;
	}
	return x;
}
int main(){
    while(scanf("%d %d",&a, &b) != EOF){
		int c = gcd(a,b);
		int num = 0;
		int i = 1;
		for(; i*i < c; i++){
			if(c % i == 0){
				num += 2;
			}
		}
		if(i * i == c){
			num += 1;
		}
		printf("%d\n",num);
    }
    return 0;
}

/**************************************************************
	Problem: 1493
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:10 ms
	Memory:1020 kb
****************************************************************/


                        