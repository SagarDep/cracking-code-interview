package stack.queues;

public class Stack {

	private Item head;


	public Stack(){}

	public void push(int data){
		Item e=new Item(data);
		if(head==null){
			head=e;
		}else{
			e.setNext(head);
			head=e;
		}
	}

	public Item pop(){
		Item removed=head;
		if(head!=null)
			head=head.getNext();
		return removed;
	}

	public void print(){
		Item tmp=head;
		while(tmp!=null){
			System.out.print(tmp.getData()+" --> ");
			tmp=tmp.getNext();
		}
		System.out.println("NULL");
	}

}
