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



//======================================
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



//======================================
// 题目1001：A+B for Matrices
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日17:32:32
 * @url：http://ac.jobdu.com/problem.php?pid=1001
 * 矩阵相加，求整行和整列为0的行列数。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/37882211
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
     * 1007
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
						new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            st.nextToken();
            int m = (int) st.nval;
            Map<Integer, Double[]> numMap =
							new HashMap<Integer, Double[]>();
            List<Double[]> counList = new ArrayList<Double[]>();
            for (int i = 0; i < n; i++) {
                Double[]country = new Double[5];
                country[0] = (double)i;
                st.nextToken();
                country[1] = (double)(int) st.nval;
                st.nextToken();
                country[2] = (double)(int) st.nval;
                st.nextToken();
                int allNum = (int) st.nval;
                country[3] = country[1]/allNum;
                country[4] = country[2]/allNum;
                numMap.put(i, country);
                counList.add(country);
            }
            List<Integer> needNumList = new ArrayList<Integer>();
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int needNum = (int)st.nval;
                needNumList.add(needNum);
            }

            for (int i = 0; i < m; i++) {
                int needNum = needNumList.get(i);
                Double[]country = new Double[5];
                country = numMap.get(needNum);
                int rank[] = {1,1,1,1};
                for (int j = 0; j < n; j++) {
                    Double []newCou = counList.get(j);
                    if (!needNumList.contains(
							(int)(double)newCou[0])) {
                        continue;
                    }
                    if ((double)newCou[0] == (double)needNum) {
                        continue;
                    }
                    if (country[1] < newCou[1]) {
                        rank[0]++;
                    }
                    if (country[2] < newCou[2]) {
                        rank[1]++;
                    }
                    if (country[3] < newCou[3]) {
                        rank[2]++;
                    }
                    if (country[4] < newCou[4]) {
                        rank[3]++;
                    }
                }
                int high = n+1;
                int seq = 0;
                for (int j = 0; j < 4; j++) {
                    if (rank[j] < high) {
                        high = rank[j];
                        seq = j;
                    }
                }
                System.out.println(high+":"+(seq+1));
            }
            System.out.println();
        }
    }
}
/**************************************************************
    Problem: 1007
    User: wzqwsrf
    Language: Java
    Result: Accepted
    Time:70 ms
    Memory:14616 kb
****************************************************************/



//======================================
// 题目1012：畅通工程
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日18:47:19
 * @url：http://ac.jobdu.com/problem.php?pid=1012
 * 并查集的典型应用。
 * 求出并查集的个数，再减去1就是需要修的道路数目
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17165557
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
     * 1012
     */
    private static int parent[];
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
            st.nextToken();
            int m = (int) st.nval;
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int f = (int) st.nval;
                st.nextToken();
                int t = (int) st.nval;
                union(f, t);
            }

            for (int i = 1; i < n + 1; i++) {
                parent[i] = findParent(i);
            }
            Set<Integer> numSet = new HashSet<Integer>();
            for (int i = 1; i < n + 1; i++) {
                numSet.add(parent[i]);
            }
            System.out.println(numSet.size() - 1);
        }
    }
    private static void union(int f, int t) {
        int a = findParent(f);
        int b = findParent(t);
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
    Problem: 1012
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:180 ms
    Memory:23560 kb
****************************************************************/



//======================================
// 题目1013：开门人和关门人
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日18:53:58
 * @url：http://ac.jobdu.com/problem.php?pid=1013
 * 不需要用sort全部排序。
 * 在输入数据的时候，直接比较开始时间和结束时间。
 * 小于或者大于的时候更新。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17252013
 */

import java.util.Scanner;
public class Main {
    /*
     * 1013
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                int M = scanner.nextInt();
                String id = scanner.next();
                String firstStr = scanner.next();
                String secStr = scanner.next();
                String firstId = id;
                String lastId = id;
                for (int j = 1; j < M; j++) {
                    String newId = scanner.next();
                    String newFirstStr = scanner.next();
                    String newSecStr = scanner.next();
                    if (newFirstStr.compareTo(firstStr) < 0 ) {
                        firstId = newId;
                    }
                    if (newSecStr.compareTo(secStr) > 0) {
                        lastId = newId;
                    }
                }
                System.out.println(firstId+" "+lastId);
            }
        }
    }
}
/**************************************************************
    Problem: 1013
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:80 ms
    Memory:15464 kb
****************************************************************/



//======================================
// 题目1018：统计同成绩学生人数
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日18:58:46
 * @url：http://ac.jobdu.com/problem.php?pid=1018
 * 本题目技巧在于数组的巧妙使用。
 * 将数据具体内容当做另外一个数组下标，统计同成绩人数。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17186375
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    /*
     * 1018
     */
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                        new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0) {
                break;
            }
            int array[] = new int[n];
            int numArr[] = new int[102];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int)st.nval;
                numArr[array[i]]++;
            }
            st.nextToken();
            int score = (int)st.nval;
            System.out.println(numArr[score]);
        }
    }
}

/**************************************************************
    Problem: 1018
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:150 ms
    Memory:22828 kb
****************************************************************/



//======================================
// 题目1021：统计字符
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日19:03:35
 * @url：http://ac.jobdu.com/problem.php?pid=1021
 * 用两个数组统计，一次循环即可搞定，输出即可。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17187077
 */

import java.util.Scanner;
public class Main {
    /*
     * 1021
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String a = scanner.nextLine();
            if (a.equals("#")){
                 break;
            }
            int numArr[] = new int[200];
            String b = scanner.nextLine();
            int len1 = a.length();
            int len2 = b.length();
            for (int i = 0; i < len2; i++) {
                numArr[b.charAt(i)]++;
            }
            for (int i = 0; i < len1; i++) {
                System.out.println(a.charAt(i)+" "+numArr[a.charAt(i)]);
            }
        }
    }
}
/**************************************************************
    Problem: 1021
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:80 ms
    Memory:15456 kb
****************************************************************/



//======================================
// 题目1023：EXCEL排序
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日10:05:10
 * @url：http://ac.jobdu.com/problem.php?pid=1023
 * 对象排序，实现C++使用sort，Java使用Arrays.sort。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17219709
 */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*
     * 1023
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            Student[] students = new Student[num];
            int seq = scanner.nextInt();
            if (num == 0&&seq==0) {
                break;
            }
            for (int i = 0; i < num; i++) {
                Student student = new Student(seq ,scanner.next(),
								scanner.next(), scanner.nextInt());
                students[i] = student;
            }
            Arrays.sort(students);
            System.out.println("Case "+count+":");
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].getStudentId()+" "+
					students[i].getName()+" "+students[i].getNum());
            }
            count += 1;
        }
        System.out.println();
    }
}
class Student implements Comparable<Student>{
    private int caseNo ;
    private String studentId;
    private String name ;
    private int num ;
    public int getCaseNo() {
        return caseNo;
    }
    public void setCaseNo(int caseNo) {
        this.caseNo = caseNo;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Student(int caseNo, String studentId,
					String name, int num) {
        super();
        this.caseNo = caseNo;
        this.studentId = studentId;
        this.name = name;
        this.num = num;
    }
    public int compareTo(Student o) {
        if (this.caseNo == 1) {
            return this.getStudentId().compareTo(o.getStudentId());
        }else if (this.caseNo == 2) {
            if (!o.getName().equals(this.getName())) {
                return this.getName().compareTo(o.getName());
            }else {
                return this.getStudentId().compareTo(o.getStudentId());
            }
        }else if (this.caseNo == 3){
            if (o.getNum()!=this.getNum()) {
                return this.getNum()-o.getNum();
            }else {
                return this.getStudentId().compareTo(o.getStudentId());
            }
        }
        return 0;
    }
}
/**************************************************************
    Problem: 1023
    User: wzqwsrf
    Language: Java
    Result: Accepted
    Time:2470 ms
    Memory:144608 kb
****************************************************************/



//======================================
// 题目1024：畅通工程
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日10:32:26
 * @url：http://ac.jobdu.com/problem.php?pid=1024
 * 并查集变形
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17166249
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
public class Main {
    /*
     * 1024
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
							new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0 ) {
                break;
            }
            st.nextToken();
            int m = (int) st.nval;
            int cost[][] = new int[m+1][m+1];
            for (int i = 1; i < m+1; i++) {
                for (int j = 1; j < m+1; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                st.nextToken();
                int d = (int) st.nval;
                if (cost[a][b] > d ) {
                    cost[a][b] = d;
                    cost[b][a] = d;
                }
            }
            int minCost[] = new int[m+1];
            int visit[] = new int[m+1];
            for (int i = 1; i < m+1; i++) {
                minCost[i] = cost[1][i];
            }
            prime(cost , minCost , visit , m);
        }
    }
    private static void prime(int[][] cost, int[] minCost, int[] visit, int m) {
        minCost[1] = 0;
        visit[1] = 1;
        int minj = 1;
        int resCost = 0;
        for (int i = 1; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j < m+1; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }
            visit[minj] = 1;
            resCost += min;
            for (int j = 1; j < m+1; j++) {
                if (visit[j] == 0 && minCost[j] > cost[minj][j]){
                    minCost[j] = cost[minj][j];
                }
            }
        }
        int num = 0;
        for (int i = 1; i < m + 1; i++) {
            if (visit[i] == 1) {
                num ++;
            }
        }
        System.out.println(num == m ? resCost : "?");
    }
}
/**************************************************************
    Problem: 1024
    User: wzqwsrf
    Language: Java
    Result: Accepted
    Time:160 ms
    Memory:23512 kb
****************************************************************/



//======================================
// 题目1025：最大报销额
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日10:37:07
 * @url：http://ac.jobdu.com/problem.php?pid=1025
 * 1、处理数据
 * 2、01背包
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/19124427
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    /*
     * 1025
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double q = scanner.nextDouble();
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            List<Integer> numList = new ArrayList<Integer>();
            while (n > 0) {
                double A = 0;
                double B = 0;
                double C = 0;
                int valid = 0;
                int m = scanner.nextInt();
                while (m > 0) {
                    String a = scanner.next();
                    String typeArr[] = a.split(Pattern.quote(":"));
                    double price = Double.parseDouble(typeArr[1]);
                    if (typeArr[0].equals("A")) {
                        A += price;
                    }else if (typeArr[0].equals("B")) {
                        B += price;
                    }else if (typeArr[0].equals("C")) {
                        C += price;
                    }else {
                        valid = 1;
                    }
                    m--;
                }
                if (valid == 0 && A <= 600.00 && B <= 600.00 && C <= 600.00) {
                    double total = A + B + C;
                    if (total <= 1000.00 && total <= q) {
                        numList.add((int) (total*100));
                    }
                }
                n--;
            }
            int len = numList.size();
            int hunq = (int) (q * 100);
            int dp[] = new int[hunq + 1];
            for (int i = 0; i < len; i++) {
                int tempNum = numList.get(i);
                for (int j = hunq; j >= tempNum; j--) {
                    dp[j] = Math.max(dp[j], dp[j - tempNum] + tempNum );
                }
            }
            double res = (double)(dp[hunq]/100.00);
            System.out.printf("%.2f\n" , res);
        }
    }
}
/**************************************************************
    Problem: 1025
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:420 ms
    Memory:49096 kb
****************************************************************/



//======================================
// 题目1028：继续畅通工程
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日11:11:52
 * @url：http://ac.jobdu.com/problem.php?pid=1028
 * 并查集变形
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17166819
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
public class Main {
    /*
     * 1028
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                            new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            if (n == 0 ) {
                break;
            }
            int cost[][] = new int[n+1][n+1];
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < n+1; j++) {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }
            int m = ((n-1)*n)/2;
            for (int i = 0; i < m; i++) {
                st.nextToken();
                int a = (int) st.nval;
                st.nextToken();
                int b = (int) st.nval;
                st.nextToken();
                int d = (int) st.nval;
                st.nextToken();
                int state = (int) st.nval;
                if (state == 1) {
                    cost[a][b] = 0;
                    cost[b][a] = 0;
                }else {
                    if (cost[a][b] > d ) {
                        cost[a][b] = d;
                        cost[b][a] = d;
                    }
                }
            }
            int minCost[] = new int[n+1];
            int visit[] = new int[n+1];
            for (int i = 1; i < n+1; i++) {
                minCost[i] = cost[1][i];
            }
            prime(cost , minCost , visit ,n);
        }
    }
    private static void prime(int[][] cost, int[] minCost, int[] visit, int n) {
        minCost[1] = 0;
        visit[1] = 1;
        int minj = 1;
        int resLen = 0;
        for (int i = 1; i < n; i++) {
             int min = Integer.MAX_VALUE;
             for (int j = 1; j < n+1; j++) {
                if (visit[j] == 0 && minCost[j] < min) {
                    min = minCost[j];
                    minj = j;
                }
            }
            visit[minj] = 1;
            resLen += min;
            for (int j = 1; j < n+1; j++) {
                if (visit[j] == 0 && minCost[j] > cost[minj][j]){
                    minCost[j] = cost[minj][j];
                }
            }
        }
        System.out.println(resLen);
    }
}
/**************************************************************
    Problem: 1028
    User: wzqwsrf
    Language: Java
    Result: Accepted
    Time:210 ms
    Memory:23232 kb
****************************************************************/



//======================================
// 题目1040：Prime Number
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日11:17:18
 * @url：http://ac.jobdu.com/problem.php?pid=1040
 * 素数筛除法
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/35781195
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
    /*
     * 1040 2014年6月29日11:08:22
     */
    private static int len;
    public static void main(String[] args) throws Exception {
        len = 200000;
        int array[] = getPrimeArray();
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int k = (int) st.nval;
            int count = 0;
            for (int i = 1; i < len; i++) {
                if (array[i] != 0) {
                    count++;
                }
                if (count == k) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
 
    private static int[] getPrimeArray() {
        int array[] = new int[len];
        for (int i = 1; i < len; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        array[1] = 0;
        array[2] = 1;
        for (int i = 2; i < len; i++) {
            if (array[i] == 1) {
                for (int j = 2 * i; j < len; j += i) {
                    array[j] = 0;
                }
            }
        }
        return array;
    }
}
/**************************************************************
    Problem: 1040
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:100 ms
    Memory:17264 kb
****************************************************************/




//======================================
// 题目1047：素数判定
/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月17日11:26:53
 * @url：http://ac.jobdu.com/problem.php?pid=1047
 * 常规法判断
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/36180571
 */
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
    /*
     * 1047 2014年7月1日11:26:43
     */
    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int num = (int) st.nval;
            if (num <= 1) {
                System.out.println("no");
                continue;
            }
            boolean flag = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "no" : "yes");
        }
    }
}
/**************************************************************
    Problem: 1047
    User: wangzhenqing
    Language: Java
    Result: Accepted
    Time:60 ms
    Memory:14552 kb
****************************************************************/
