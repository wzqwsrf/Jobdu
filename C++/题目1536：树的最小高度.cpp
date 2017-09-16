
// 题目1536：树的最小高度

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2017-09-16 22:51:57
 * @url:http://ac.jobdu.com/problem.php?pid=1536
 */

#include <stdio.h>
#include <vector>
using namespace std;

int n, u, v;

int main() {
    while (scanf("%d", &n) != EOF) {
        vector< vector<int> > adj(n);
        for (int i = 1; i < n; i++) {
            scanf("%d %d", &u, &v);
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        if (n == 0 || n == 1) {
            printf("%d\n", 0);
            continue;
        }
        vector<int> current;

        for (int i = 0; i < n; ++i) {
            if (adj[i].size() == 1) {
                current.push_back(i);
            }
        }

        int ans = 0;
        while (n > 2) {
            ans += 1;
            int size = current.size();
            n -= size;
            vector<int> next;
            for (int i = 0; i < size; i++) {
                int u = current[i];
                int size2 = adj[u].size();
                for (int j = 0; j < size2; j++) {
                    int v = adj[u][j];
                    for(vector<int>::iterator it = adj[v].begin();
                                                it != adj[v].end();){
                        if(* it == u){
                             it = adj[v].erase(it); //不能写成arr.erase(it);
                        }else{
                            it++;
                        }
                    }
                    if (adj[v].size() == 1) {
                        next.push_back(v);
                    }
                }
            }
            current = next;
        }
        if(current.size() == 2){
            ans += 1;
        }
        printf("%d\n", ans);
    }
    return 0;
}
/**************************************************************
    Problem: 1536
    User: wzqwsrf
    Language: C++
    Result: Accepted
    Time:3220 ms
    Memory:60936 kb
****************************************************************/




