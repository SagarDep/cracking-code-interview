package stack.queues;

public class Item {

	private int data;
	private Item next;

	public Item(int data){
		this.data=data;
	}

	public Item(){}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item next) {
		this.next = next;
	}
}
