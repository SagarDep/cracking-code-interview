package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<Character, List<Character>> graph;

	private Node root;

	public Graph(){
		graph=new HashMap<Character, List<Character>>();
	}

	public void add(Node node){

	}

	public Character getRoot(){
		return (Character) graph.keySet().toArray()[0];
	}
	public void insert(Character item, List<Character> list){
		graph.put(item, list);
	}

	public void print(){
		graph.forEach((c,l) -> {
			System.out.print(c+": ");
			l.forEach(e -> System.out.print(e+" "));
			System.out.println();
		});
	}

	public void dfs(){
		boolean visited[]=new boolean[graph.size()];
		Arrays.fill(visited, false);
		Stack stack=new Stack();
		stack.push(getRoot());
		while(!stack.empty()){
			char c=stack.pop().getData();
			if(!visited[getPlace(c)]){
				System.out.println(c);
				visited[getPlace(c)]=true;
				for(char e:graph.get(c))
					stack.push(e);
			}
		}
	}

	public void bfs(){
		boolean visited[]=new boolean[graph.size()];
		Arrays.fill(visited, false);
		graph.forEach((node, children) -> {
			if(!visited[getPlace(node)]){
				System.out.println(node);
				visited[getPlace(node)]=true;
				children.forEach(c -> {
					if(!visited[getPlace(c)]){
						System.out.println(c);
						visited[getPlace(c)]=true;
					}
				});
			}
		});
	}

	public int getPlace(char c){
		return c%graph.size();
	}
}
