package jukebox;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private List<Song> songs;

	public Playlist(){
		songs=new ArrayList<>();
	}

	public void add(Song song){
		songs.add(song);
	}

	public Song remove(Song song){
		songs.remove(song);
		return song;
	}

	public void describe(){
		songs.forEach(s -> {
			System.out.println(s.getTitle()+" - "+s.getArtist().getName()+" - "+s.getGenre().toString());
		});
	}

	public List<Song> iterator(){
		return songs;
	}
}
