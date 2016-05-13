package test;

import java.util.Locale.Category;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bst.BinaryTree;
import bst.Node;
import callcenter.CallCenter;
import deckcards.Card;
import deckcards.CardV2;
import deckcards.Club;
import deckcards.Diamond;
import deckcards.Heart;
import deckcards.Spade;
import graph.Graph;
import graph.Stack;
import jukebox.Artist;
import jukebox.Genre;
import jukebox.Jukebox;
import jukebox.Playlist;
import jukebox.Song;

public class Main {

	public static void main(String[] args) {
		Playlist playlist1=new Playlist();
		playlist1.add(new Song("In The End", new Artist("Linkin Park"), Genre.Rock));
		playlist1.add(new Song("Hello", new Artist("Adele"), Genre.Pop));
		playlist1.add(new Song("My Immortal", new Artist("Evanescence"), Genre.Rock));

		Playlist playlist2=new Playlist();
		playlist2.add(new Song("I'm not afraid", new Artist("Eminem"), Genre.Rap));
		playlist2.add(new Song("In da club", new Artist("50 cent"), Genre.Rap));
		playlist2.add(new Song("Love the way you life", new Artist("Eminem"), Genre.Rap));

		Jukebox jukebox=new Jukebox();
		jukebox.create("80s", playlist1);
		jukebox.create("Rap", playlist2);

		jukebox.list();
		jukebox.play("Rap");
	}

}
