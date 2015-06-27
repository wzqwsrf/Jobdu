
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
	/*
	 * 1540
	 */
	private static int currentTime;
	private static List<Song> songList;
	public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			songList = new ArrayList<Song>();
			int n = (int)st.nval;
			while (n > 0) {
				n--;
				st.nextToken();
				currentTime = (int)st.nval;
				st.nextToken();
				String operate = st.sval;
				if (operate.equals("add")) {//将歌曲添加到列表尾
					st.nextToken();
					int len = (int)st.nval;
					st.nextToken();
					int isMine = (int)st.nval;
					addSong(len, isMine);
				}else if (operate.equals("top")) {
					st.nextToken();
					int num = (int)st.nval;
					topSong(num);
				}else if (operate.equals("delete")) {
					st.nextToken();
					int num = (int)st.nval;
					delSong(num);
				}else {//cut
					cutSong();
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
	}
	private static void addSong(int len, int isMine) {
		int startTime = currentTime;
		//添加歌曲的时候需要判断一下，如果列表为空的话，那么添加歌曲的播放时间为操作时间+1
		if (songList.isEmpty()) {
			startTime = currentTime + 1;
		}else {
			int size = songList.size();
			Song lastSong = songList.get(size-1);
			int endTime = lastSong.endTime;
			//如果上一首歌已播放完毕，那么添加歌曲的播放时间为操作时间+1
			if (currentTime >= endTime) {
				startTime = currentTime + 1;
			}else {//否则的话，添加歌曲的播放时间为上一首歌的结束时间
				startTime = endTime;
			}
		}
		Song song = new Song(startTime, startTime + len, len ,isMine);
		songList.add(song);
	}
	private static void cutSong() {
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
		//切歌的话始终切的是当前歌曲，需要判断当前是否有歌曲播放，如果没有，就不做任何操作。
		if (currentTop == -1) {
			return;
		}
		//获取当前歌曲是在list中的位置，将结束时间修改为当前时间。
		//当前歌曲之后的所有歌曲的开始时间都需要修改。
		//注意cut之后的下一首歌曲的播放时间为当前时间+1，因为操作需要一个时间点。
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
	private static void delSong(int num) {
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
		//因为删除的歌曲一定在列表中，所以只需要找到删除的歌曲在list中的序号。
		//排在删除之后第一个的开始时间为删除序号前一个的结束时间，其他依次类推。
		for (int i = needDel+1; i < size; i++) {
			Song delSong = songList.get(i);
			int newSize = tempList.size();
			Song newSong = tempList.get(newSize - 1);
			tempList.add(new Song(newSong.endTime, newSong.endTime + delSong.len,delSong.len, delSong.isMine));
		}
		songList.clear();
		songList.addAll(tempList);
		tempList.clear();
		
	}
	private static void topSong(int num) {
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
		//top的时候考虑一下，如果已选列表(不包括正在播放的)只有一首，并且top的歌曲号也是1，就不做任何操作了。
		if (num == 1 && needMove == size - 1) {
			return;
		}
		//如果top的那个时刻刚好是当前歌曲结束的时间点，那么top之后的那首歌曲的播放时间应该是当前时间+1;
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
	}
	
	private static class Song{
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
	User: wzqwsrf
	Language: Java
	Result: Accepted
	Time:1980 ms
	Memory:48224 kb
****************************************************************/


                        