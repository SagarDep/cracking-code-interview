package linkedlists;

public class Item {

	private char data;

	private Item next;
	private Item prev;

	public Item(){}

	public Item(char data){
		this.data=data;
	}

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
	public Item getPrev() {
		return prev;
	}
	public void setPrev(Item prev) {
		this.prev = prev;
	}


}
