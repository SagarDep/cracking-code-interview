package graph;

public class Queue {
	private int size;
	private Item first, last;

	public Queue(){}

	public void enqueue(char c){
		Item e=new Item(c);
		if(first==null){
			first=last=e;
		}else{
			last.setNext(e);
			last=e;
		}
		size++;
	}

	public Item dequeue(){
		Item e=first;
		if(first!=null){
			first=first.getNext();
			size--;
		}
		return e;
	}

	public boolean empty(){
		return size == 0;
	}

}
