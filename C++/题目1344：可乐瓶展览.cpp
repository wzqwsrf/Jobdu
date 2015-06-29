
#include <cstdio>
#include <vector>
#include <set>
 
using namespace std;
 
struct Node{
    int start;
    int end;
};
 
int main(){
    int n,k;
    int maxlen;
	int i,j;
    vector <Node> vecr;
    multiset<int, greater<int> > imul;
    while(scanf("%d%d",&n,&k)!=EOF){
		int *array = new int[n];
        for(i = 0; i < n; i++){
			scanf("%d",&array[i]);
		}
        maxlen = 0;
        vecr.clear();
        imul.clear();
		j = 0;
        for(i = 0; i < n; i++ ){
            imul.insert(array[i]);
            while(*imul.begin()>*imul.rbegin()+k){
                imul.erase(imul.find(array[j]));
                ++j;
            }
            int tmp = i - j + 1;
            if(tmp == maxlen){
                 Node node;
                 node.start = j;
                 node.end = i;
                 vecr.push_back(node);
            }else if(tmp > maxlen){
                maxlen = tmp;
                Node node;
                node.start = j;
                node.end = i;
                vecr.clear();
                vecr.push_back(node);
            }
        }
        printf("%d %d\n",maxlen,vecr.size());
        for(vector<Node>::iterator it = vecr.begin();it != vecr.end();it++){
			printf("%d %d\n",it->start + 1,it->end + 1);
		}  
    }
    return 0;
}

/**************************************************************
	Problem: 1344
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:90 ms
	Memory:4536 kb
****************************************************************/


                        