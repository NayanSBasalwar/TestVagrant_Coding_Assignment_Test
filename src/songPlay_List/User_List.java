package songPlay_List;

import java.util.LinkedList;
import java.util.Queue;

public class User_List {
	
	private String name;
	private Queue<Song_List> songList;
	static final int songListSize = 3;
	
	public User_List(String name) {
		this.name = name;
		this.songList = new LinkedList<>();
	}
	
	public void playSong(Song_List song) {
		if(this.songList.size() > songListSize-1) {
			this.songList.remove();
		}
			this.songList.add(song);
	}
	
	public void displaySongs() {
		System.out.println("Songs Played By " + this.name);
		songList.forEach(s-> System.out.println(s.getName()));
	}

}
