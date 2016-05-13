package jukebox;

public class Song {

	private String title;

	private Artist artist;

	private Genre genre;

	public Song(String title, Artist artist, Genre genre){
		this.title=title;
		this.artist=artist;
		this.genre=genre;
	}

	public Song(){}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String toString(){
		return getTitle()+" - "+getArtist().getName()+" - "+getGenre().toString();
	}

	public void play(){
		System.out.println("Now playing: "+title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
