package test;

import java.util.Locale.Category;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bst.BinaryTree;
import bst.Node;
import deckcards.Card;
import deckcards.CardV2;
import deckcards.Club;
import deckcards.Diamond;
import deckcards.Heart;
import deckcards.Spade;
import graph.Graph;
import graph.Stack;

public class Main {

	public static void main(String[] args) {
		Stream.of('A','2','3','4','5','6','7','8','9','J','K','Q')
			  .forEach(c -> {
				  Card card=new Club(c);
				  System.out.print(card+" ");
				  card=new Diamond(c);
				  System.out.print(card+" ");
				  card=new Heart(c);
				  System.out.print(card+" ");
				  card=new Spade(c);
				  System.out.println(card);
			  });

	}

}
