// 题目1446：Head of a Gang
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月03日14:33:53
 * @url：http://ac.jobdu.com/problem.php?pid=1446
 * 并查集变形，比一般并查集稍难，重点在理清思路
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17101513
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    /*
     * 1446
     */
    private static int parent[];
    private static int maxn = 2002;
    private static int currNum , count;
    private static Map<String, Integer> baseMap ;
    private static Map<Integer, List<Integer>> groupMap;
    private static Map<String, Integer> resultMap;
    private static String array[] ;
    private static String keys[] ;
    private static int callTime[] ,singleCallTime[];

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int)st.nval;
            st.nextToken();
            int k = (int)st.nval;
            initParent(n);
            for (int i = 0; i < n; i++) {
                st.nextToken();
                String a = st.sval;
                st.nextToken();
                String b = st.sval;
                st.nextToken();
                int d = (int)st.nval;
                int anum = getCurrentNum(a);
                int bnum = getCurrentNum(b);
                constructData(a , b, anum , bnum ,d);
                unionTwo(anum, bnum);
            }
            for (int i = 1; i < currNum+1; i++) {
                parent[i] = findParent(i);
            }
//          具体哪个组包含哪些组员
            divideGroup();
//          判断组员个数是不是大于三人，组内通话时间是否大于k;
            checkNeedResult(k);
//          打印结果
            printfResult();
        }
    }

    private static void initParent(int n) {
        parent = new int[maxn];
        for (int i = 1; i < maxn; i++) {
            parent[i] = i;
        }
        baseMap = new HashMap<String, Integer>();
        array = new String[maxn];
        callTime = new int[maxn];
        singleCallTime = new int[maxn];
        currNum = 0;
    }

    private static void constructData(String a, String b, int anum, int bnum, int d) {
        if (singleCallTime[anum] == 0) {
            singleCallTime[anum] = d;
        }else {
            singleCallTime[anum] += d;
        }

        array[anum] = a;
        array[bnum] = b;
        callTime[anum] += d;
        callTime[bnum] += d;
    }


    private static void divideGroup() {
        groupMap = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i < currNum+1; i++) {
            List<Integer> groupMems = null;
            if (groupMap.containsKey(parent[i])) {
                groupMems = groupMap.get(parent[i]);
            }else {
                groupMems = new ArrayList<Integer>();
            }
            groupMems.add(i);
            groupMap.put(parent[i], groupMems);
        }
    }

    private static void checkNeedResult(int k) {
        keys = new String[currNum+1];
        count = 0;
        resultMap = new HashMap<String, Integer>();
        for(Entry<Integer, List<Integer>> entry : groupMap.entrySet()){
            List<Integer> groupMems = entry.getValue();
            int size = groupMems.size();
            if (size < 3) {
                continue;
            }
            int allTime = 0;
            int maxTime = -1;
            int maxMem = 0;
            for (int i = 0; i < size; i++) {
                int mem = groupMems.get(i);
                allTime += singleCallTime[mem];
                if (callTime[mem] > maxTime) {
                    maxTime = callTime[mem];
                    maxMem = mem;
                }
            }
            if (allTime <= k ) {
                continue;
            }
            resultMap.put(array[maxMem], size);
            keys[count] = array[maxMem];
            count++;
        }
    }

    private static void printfResult() {
        Arrays.sort(keys , 0, count);
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(keys[i]+" "+resultMap.get(keys[i]));
        }
    }

    private static int getCurrentNum(String c) {
        int num = 0;
        if (!baseMap.containsKey(c)) {
            currNum++;
            num = currNum;
            baseMap.put(c, num);
        }else {
            num = baseMap.get(c);
        }
        return num;
    }

    private static void unionTwo(int f, int t) {

        int a = findParent( f );
        int b = findParent( t );
        if (a == b) return;
        if (a > b) {
            parent[a] = b;
         } else {
            parent[b] = a;
         }
    }

    private static int findParent(int f) {
        while (parent[f] != f) {
            f = parent[f];
        }
        return f;
    }
}

/**************************************************************
    Problem: 1446
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:290 ms
    Memory:28428 kb
****************************************************************/

// 目1529：棋盘寻宝
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月04日11:37:20
 * @url：http://ac.jobdu.com/problem.php?pid=1529
 * 简单dp，每次只能往右或者往下走。
 * 1、当在首行时，上一步走到当前步，只能是右走。因此当前拿到礼物的最大价值是前一列拿到礼物的值加上当前礼物的值。
 * dp[i][j] = dp[i][j-1] + array[i][j];
 * 2、当在首列时，上一步走到当前步，只能是下走。因此当前拿到礼物的最大价值是前一行拿到礼物的值加上当前礼物的值。
 * dp[i][j] = dp[i-1][j] + array[i][j];
 * 3、在其他位置，可以往下或者往右，因此最大值为
 * dp[i][j] = max(dp[i-1][j], dp[i][j-1])+array[i][j];
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/25304325
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1529
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int len = 8;
            int array[][] = new int[len][len];
            array[0][0] = (int)st.nval;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    st.nextToken();
                    array[i][j] = (int)st.nval;
                }
            }
            int dp[][] = new int[len][len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == 0 && j == 0) {
                        dp[i][j] = array[i][j];
                    }else if (i == 0) {
                        dp[i][j] = dp[i][j-1] + array[i][j];
                    }else if (j == 0) {
                        dp[i][j] = dp[i-1][j] + array[i][j];
                    }else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+array[i][j];
                    }
                }
            }
            System.out.println(dp[7][7]);
        }
    }
}
/**************************************************************
    Problem: 1529
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:340 ms
    Memory:14748 kb
****************************************************************/

