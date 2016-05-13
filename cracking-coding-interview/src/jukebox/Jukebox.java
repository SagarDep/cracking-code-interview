package jukebox;

import java.util.HashMap;

public class Jukebox {
	private HashMap<String, Playlist> playlists;

	public Jukebox(){
		playlists=new HashMap<>();
	}

	public void create(String category, Playlist l){
		playlists.put(category, l);
	}

	public void list(){
		playlists.forEach((c,l) -> {
			System.out.println("Category: "+c);
			l.iterator().forEach(s -> {
				System.out.println("\t"+s);
			});
		});
	}

	public void play(String category){
		System.out.println("You have choose:"+category);
		Playlist chosen=playlists.get(category);
		chosen.iterator().forEach(s -> {
			s.play();
		});
	}
}
