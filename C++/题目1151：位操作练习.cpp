
#include <stdio.h>
int n,a,b;

int main(){
	while(scanf("%d",&n) != EOF){
		for(int i = 0; i < n; i++){
			scanf("%d %d",&a,&b);
			bool flag = false;
            for (int j = 0; j < 16; j++) {
				int c = (a >> (16 - j)) | (a << j);
                c &= 0xFFFF;
                if (c == b) {
					flag = true;
                    printf("YES\n");
                    break;
                }
             }
             if (!flag) {
				printf("NO\n");
             }
		}
	}
	return 0;
}
/**************************************************************
	Problem: 1151
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:0 ms
	Memory:1020 kb
****************************************************************/


                        