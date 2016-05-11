package test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import graph.Graph;

public class Main {

	public static void main(String[] args) {
		Graph graph=new Graph();
		graph.insert('A', Stream.of('B','C','D').collect(Collectors.toList()));
		graph.insert('B', Stream.of('A','F','E').collect(Collectors.toList()));
		graph.insert('C', Stream.of('A','F').collect(Collectors.toList()));
		graph.insert('D', Stream.of('A').collect(Collectors.toList()));
		graph.insert('E', Stream.of('B').collect(Collectors.toList()));
		graph.insert('F', Stream.of('B','C').collect(Collectors.toList()));
	}

}
