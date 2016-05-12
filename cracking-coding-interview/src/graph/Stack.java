package graph;

public class Stack {

	private Item top;
	private int size;

	public Stack(){}

	public boolean empty(){
		return size == 0;
	}

	public void push(char c){
		Item e=new Item(c);
		e.setNext(top);
		top=e;
		size++;
	}

	public Item pop(){
		Item e=top;
		if(top!=null){
			top=top.getNext();
			size--;
		}
		return e;
	}

	public void print(){
		Item e=top;
		while(e!=null){
			System.out.print(e.getData()+" ");
			e=e.getNext();
		}
		System.out.println("NULL");
	}
}
