
#include <stdio.h>
#include <math.h>

int main()
{	
	int ex;
	double base;
	int n;
    while(scanf("%d",&n) != EOF){
        for(int i = 0; i < n; i++){
            scanf("%lf %d",&base,&ex);
            if(base == 0 && ex < 0){
                printf("INF\n");
            }else{
                double res = pow(base,ex);
                printf("%.2e",res);
				printf("f\n");
            }
        }
    }
    return 0;
}
/**************************************************************
	Problem: 1514
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:90 ms
	Memory:1108 kb
****************************************************************/


                        