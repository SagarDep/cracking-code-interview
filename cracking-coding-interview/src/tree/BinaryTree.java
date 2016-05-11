package tree;

public class BinaryTree {
	private int size;
	private Node root;

	public BinaryTree(){}


	public int size(){
		return size;
	}

	public Node getRoot(){
		return root;
	}

	public void insert(int data){
		Node e=new Node(data);
		if(root==null){
			root=e;
		}else{
			Node tmp=root;
			Node prev=root;
			while(tmp!=null){
				prev=tmp;
				if(tmp.getData() > data)
					tmp=tmp.getLeft();
				else
					tmp=tmp.getRight();
			}
			if(prev.getData() > data)
				prev.setLeft(e);
			else
				prev.setRight(e);
		}
		size++;
	}

	public void inorder(Node focusNode){
		if(focusNode!=null){
			inorder(focusNode.getLeft());
			System.out.print(focusNode.getData()+" ");
			inorder(focusNode.getRight());
		}
	}

	public void preorder(Node focusNode){
		if(focusNode!=null){
			System.out.print(focusNode.getData()+" ");
			preorder(focusNode.getLeft());
			preorder(focusNode.getRight());
		}
	}

	public void postorder(Node focusNode){
		if(focusNode!=null){
			postorder(focusNode.getLeft());
			postorder(focusNode.getRight());
			System.out.print(focusNode.getData()+" ");
		}
	}
}
