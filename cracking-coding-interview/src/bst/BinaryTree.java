package bst;

import java.util.Arrays;

public class BinaryTree {
    private Node root;

    public Node insert(int data){
    	Node element=new Node(data);
    	if(root==null){
    		root=element;
    	}else{
    		Node tmp,prev;
    		tmp=prev=root;
    		while(tmp!=null){
    			prev=tmp;
    			if(tmp.getData() > data)
    				tmp=tmp.getLeft();
    			else
    				tmp=tmp.getRight();
    		}
    		if(prev.getData() > data)
    			prev.setLeft(element);
    		else
    			prev.setRight(element);
    	}
    	return element;
    }

    public void inorder(Node focusNode){
        if(focusNode!=null){
        	inorder(focusNode.getLeft());
        	System.out.print(focusNode.getData()+" ");
        	inorder(focusNode.getRight());
        }
    }

    public Node constructBST(int[] input){
    	Node tree=new Node();
    	return construct(tree, input, 0, input.length);
    }

    public Node construct(Node tree, int[] input, int min, int max){
    	if(min>=max)
    		return null;
    	int middle=(min+max)/2;
    	int element=input[middle];
    	Node e=insert(element);

    	construct(e.getLeft(), input, min, middle);
    	construct(e.getRight(), input, middle+1, max);

    	return e;
    }

    public Node getRoot(){
    	return root;
    }
}
