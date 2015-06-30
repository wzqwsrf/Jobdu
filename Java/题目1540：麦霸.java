
// 题目1540：麦霸

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1540
 * 解题思路参考csdn:http://blog.csdn.net/u013027996/article/details/19555087
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			List<Song> songList = new ArrayList<Song>();
			int n = (int)st.nval;
			while (n > 0) {
				n--;
				st.nextToken();
				int currentTime = (int)st.nval;
				st.nextToken();
				String operate = st.sval;
				if (operate.equals("add")) {//将歌曲添加到列表尾
					st.nextToken();
					int len = (int)st.nval;
					st.nextToken();
					int isMine = (int)st.nval;
					int startTime = currentTime;
					if (songList.isEmpty()) {
						startTime = currentTime + 1;
					}else {
						int size = songList.size();
						Song lastSong = songList.get(size-1);
						int endTime = lastSong.endTime;
						if (currentTime >= endTime) {
							startTime = currentTime + 1;
						}else {
							startTime = endTime;
						}
					}
					Song song = new Song(startTime, startTime + len, len ,isMine);
					songList.add(song);
				}else if (operate.equals("top")) {
					st.nextToken();
					int num = (int)st.nval;
					int size = songList.size();
					int rankNum = 0;
					int currentTop = 0;
					int needMove = size - 1;
					List<Song> tempList = new ArrayList<Song>(); 
					for (int i = 0; i < size; i++) {
						Song song = songList.get(i);
						int endTime = song.endTime;
						if (currentTime >= endTime ) {
							tempList.add(song);
							continue;
						}
						if (currentTime >= song.startTime && currentTime < endTime) {
							currentTop = i;
							tempList.add(song);
							continue;
						}
						rankNum++;
						if (rankNum == num) {
							needMove = i;
							break;
						}
					}
					if (num == 1 && needMove == size - 1) {
						continue;
					}
					Song currentSong = songList.get(currentTop);
					int topEndTime = currentSong.endTime;
					if (topEndTime == currentTime) {
						topEndTime += 1;
					}
					Song needSong = songList.get(needMove);
					Song newSong = new Song(topEndTime,topEndTime+needSong.len, needSong.len, needSong.isMine);
					tempList.add(newSong);
					for (int i = currentTop+1; i < size; i++) {
						Song song = songList.get(i);
//						songList.remove(song);
//						long endTime = 0;
						if (i == needMove) {
							continue;
						}
						int newSize = tempList.size();
						Song lastSong = tempList.get(newSize - 1);
						tempList.add(new Song(lastSong.endTime, lastSong.endTime + song.len,song.len, song.isMine));
					}
					songList.clear();
					songList.addAll(tempList);
					tempList.clear();
				}else if (operate.equals("delete")) {
					st.nextToken();
					int num = (int)st.nval;
					int size = songList.size();
					int needDel = 0;
					int rankNum = 0;
					List<Song> tempList = new ArrayList<Song>();
					for (int i = 0; i < size; i++) {
						Song song = songList.get(i);
						int endTime = song.endTime;
						if (currentTime >= endTime ) {
							tempList.add(song);
							continue;
						}
						if (currentTime >= song.startTime && currentTime < endTime) {
							tempList.add(song);
							continue;
						}
						rankNum++;
						if (rankNum == num) {
							needDel = i;
							break;
						}
						tempList.add(song);
					}
					for (int i = needDel+1; i < size; i++) {
						Song delSong = songList.get(i);
						int newSize = tempList.size();
						Song newSong = tempList.get(newSize - 1);
						tempList.add(new Song(newSong.endTime, newSong.endTime + delSong.len,delSong.len, delSong.isMine));
					}
					songList.clear();
					songList.addAll(tempList);
					tempList.clear();
				}else {//cut
					int size = songList.size();
					int currentTop = -1;
					List<Song> tempList = new ArrayList<Song>();
					for (int i = 0; i < size; i++) {
						Song song = songList.get(i);
						int endTime = song.endTime;
						if (currentTime >= song.startTime && currentTime < endTime) {
							currentTop = i;
							break;
						}
						tempList.add(song);
					}
					if (currentTop == -1) {
						continue;
					}
					Song cutSong = songList.get(currentTop);
					tempList.add(new Song(cutSong.startTime, currentTime, cutSong.len, cutSong.isMine));
					for (int i = currentTop+1; i < size; i++) {
						Song song = songList.get(i);
						int newSize = tempList.size();
						Song newSong = tempList.get(newSize - 1);
						int endTime = newSong.endTime;
						if (i == currentTop + 1) {
							endTime = currentTime + 1;
						}
						tempList.add(new Song(endTime, endTime + song.len,song.len, song.isMine));
					}
					songList.clear();
					songList.addAll(tempList);
					tempList.clear();
				}
			}
			int size = songList.size();
			for (int i = 0; i < size; i++) {
				Song song = songList.get(i);
				if (song.isMine == 1) {
					System.out.println(song.startTime);
				}
			}
		}
	}    private static class Song {
        private int startTime;

        private int endTime;

        private int len;

        private int isMine;

        public Song(int startTime, int endTime, int len, int isMine) {
            super();
            this.startTime = startTime;
            this.endTime = endTime;
            this.len = len;
            this.isMine = isMine;
        }
    }
}
/**************************************************************
 Problem: 1540
 User: wangzhenqing
 Language: Java
 Result: Accepted
 Time:2200 ms
 Memory:49928 kb
 ****************************************************************/




