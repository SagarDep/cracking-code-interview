package graph;

public class Item {

	private char data;

	private Item next;

	public Item(char data){
		this.data=data;
	}

	public Item(){}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item next) {
		this.next = next;
	}
}
