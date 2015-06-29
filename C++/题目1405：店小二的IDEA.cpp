
#include<stdio.h>
#include<string.h>
const int maxn = 100002;
char str[maxn];
int next[maxn];
int n;

void getNext(){  
    int i = 0,j = -1;  
    next[0] = -1;   
    while( i < n){  
        if(j == -1 || str[i] == str[j]){  
            i++;      
            j++;        
            next[i] = j;     
        }else{
            j = next[j];   
		}
    }
}
int main(){   
    while(scanf("%s",&str)!=EOF){  
        n=strlen(str);  
        getNext();        
        if(n % (n-next[n]) == 0){     
            str[n-next[n]] = '\0';          
            printf("%s%d\n",str,n/(n-next[n]));       
        }else{
            printf("%s1\n",str);  
		}
    }  
    return 0;
}
/**************************************************************
	Problem: 1405
	User: wzqwsrf
	Language: C++
	Result: Accepted
	Time:710 ms
	Memory:1508 kb
****************************************************************/


                        