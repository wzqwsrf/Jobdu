
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
    private static String array[] ;
    private static Node nodes[] ;
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
        nodes = new Node[n];
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
    	nodes = new Node[currNum+1];
        count = 0;
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
            nodes[count] = new Node(array[maxMem], size);
            count++;
        }
    }
 
    private static void printfResult() {
    	Arrays.sort(nodes , 0, count);
    	System.out.println(count);
    	for (int i = 0; i < count; i++) {
			System.out.println(nodes[i].gang+" "+nodes[i].size);
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
      
    private static class Node implements Comparable<Node>{
        String gang;
        int size;
		public Node(String gang, int size) {
			super();
			this.gang = gang;
			this.size = size;
		}
		public int compareTo(Node o) {
			return this.gang.compareTo(o.gang);
		}
        
    }
}

/**************************************************************
	Problem: 1446
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:350 ms
	Memory:27384 kb
****************************************************************/


                        