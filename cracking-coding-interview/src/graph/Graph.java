package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<Character, List<Character>> graph;

	public Graph(){
		graph=new HashMap<Character, List<Character>>();
	}

	public void insert(Character item, List<Character> list){
		graph.put(item, list);
	}

	public void print(){
		graph.forEach((c,l) -> {
			System.out.print(c+": ");
			l.forEach(System.out::print);
			System.out.println();
		});
	}
	
	public void dfs(){
		
	}
}
