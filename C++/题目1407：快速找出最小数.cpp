
#include <stdio.h>
#include <string.h>
const int maxn = 100002 << 2;
#define Min(a,b) ((a)<(b)?(a):(b))
 
int TreeMin[maxn],add[maxn];
 
void build(int l,int r,int k){
    add[k]=0;
    if(l == r){
        scanf("%d",&TreeMin[k]);
        return;
    }
    int mid = (l+r) >> 1;
	int newK = k << 1;
    build(l, mid, newK);
    build(mid+1, r, newK|1);
    TreeMin[k] = Min(TreeMin[newK],TreeMin[newK|1]);
}
 
void pushDown(int k){

	if(add[k]){
		int newK = k << 1; 
		add[newK]+=add[k];
		TreeMin[newK]+=add[k];
		add[newK|1]+=add[k];
		TreeMin[newK|1]+=add[k];
		add[k]=0;
	}
}
 
void update(int l,int r,int k,int L,int R,int data){

    if(L==l && R==r){
        add[k] +=data;
        TreeMin[k] +=data;
        return;
    }
    pushDown(k);
    int mid=( L + R) >> 1;
	int newK = k << 1;
    if(r <= mid){
		update(l,r,newK,L,mid,data);
	} else if(l > mid){
		update(l,r,newK|1,mid+1,R,data);
	}else{
        update(l,mid,newK,L,mid,data);
        update(mid+1,r,newK|1,mid+1,R,data);
    }
    TreeMin[k] = Min(TreeMin[newK],TreeMin[newK|1]);
}
 
int query(int l,int r,int k,int L,int R){

    if(L == l && R == r){
		return TreeMin[k];
	}    
    pushDown(k);
    int mid = ( L + R) >> 1 ;
	int newK = k << 1;
    if(r <= mid){
		 return query(l,r,newK,L,mid);
	}else if(l>mid){
        return query(l,r,newK|1,mid+1,R);
	}else{
        int t1 = query(l,mid,newK,L,mid);
		int	t2 = query(mid+1,r,newK|1,mid+1,R);
        return Min(t1,t2);
    }
}
 
int main()
{
    int n,l,r,w,m;
    char s[100];
    while(scanf("%d",&n) != EOF){
        build(1,n,1);
        scanf("%d",&m);
        getchar();
        while(m--){   
            gets(s);
            int num = sscanf(s,"%d %d %d",&l,&r,&w);
			l++;
			r++;
            if(num == 2){
                if(l <= r){
					printf("%d\n",query(l,r,1,1,n));
				}else{
                    int t1 = query(1,r,1,1,n);
					int	t2 = query(l,n,1,1,n);
                    printf("%d\n",Min(t1,t2));
                }
            }else{
                if(l <= r){
					update(l,r,1,1,n,w);
				}else{
                    update(1,r,1,1,n,w);
                    update(l,n,1,1,n,w);
                }
            }
        }
    }
	return 0;
}
/**************************************************************
	Problem: 1407
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:320 ms
	Memory:4144 kb
****************************************************************/


                        