package test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import bst.BinaryTree;
import bst.Node;
import graph.Graph;
import graph.Stack;

public class Main {

	public static void main(String[] args) {
		int[] input={1,2,3};
		BinaryTree tree=new BinaryTree();
		Node root=tree.constructBST(input);
		tree.inorder(root);

	}

}
