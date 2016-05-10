package linkedlists;

public class LinkedList {

	private Node root;

	public LinkedList() {

	}

	public void appendToTail(int data) {
		Node e=new Node(data);
		if (root == null) {
			root = e;
		} else {
			Node tmp = root;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(e);
		}
	}

	public void deleteHead(){
		if(root!=null)
			root=root.getNext();
	}

	public void printNodes() {
		Node tmp = root;
		while (tmp != null) {
			System.out.print(tmp.getData() + " -> ");
			tmp = tmp.getNext();
		}
		System.out.println("NULL");
	}

	public boolean find(int data){
		Node tmp = root;
		while (tmp != null) {
			if(tmp.getData()==data)
				return true;
			tmp = tmp.getNext();
		}
		return false;
	}

	public LinkedList removeDuplicate(){
		Node tmp=root;
		LinkedList newList=new LinkedList();
		while(tmp!=null){
			int value=tmp.getData();
			System.out.println(value+" "+find(value));
			if(!newList.find(value))
				newList.appendToTail(value);
			tmp = tmp.getNext();
		}
		return newList;
	}

	/*
	 *
	 * 3 -> 1 -> 5
	 * 5 -> 9 -> 2
	 * 8 0 8
	 */
	public LinkedList sum(LinkedList l){
		LinkedList sum=new LinkedList();
		StringBuffer n1=new StringBuffer();
		StringBuffer n2=new StringBuffer();
		Node t1=root;
		Node t2=l.root;
		for(;t1!=null || t2!=null;t1=t1.getNext(), t2=t2.getNext()){
			n1.append(t1.getData());
			n2.append(t2.getData());
		}
		while(t1!=null){
			n1.append(t1.getData());
			t1=t1.getNext();
		}
		while(t2!=null){
			n1.append(t2.getData());
			t2=t2.getNext();
		}
		int s=Integer.valueOf(n1.toString())+Integer.valueOf(n2.toString());
		while(s>0){
			int r=s%10;
			s=s/10;
			sum.appendToTail(r);
		}
		return sum;
	}

}
