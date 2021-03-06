package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private int data;

	private List<Node> children;

	public Node(){
		children=new ArrayList();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}
}
