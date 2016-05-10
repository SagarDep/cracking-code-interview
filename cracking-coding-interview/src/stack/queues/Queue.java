package stack.queues;


public class Queue {

	private Item first, last;

	public Queue(){}

	public void enqueue(int data){
		Item e=new Item(data);
		if(first==null){
			first=last=e;
		}else{
			last.setNext(e);
			last=e;
		}
	}

	public Item dequeue(){
		Item item=null;
		if(first==null)
			return item;
		else{
			item=first;
			first=first.getNext();
		}
		return item;
	}

	public void print(){
		for(Item tmp=first;tmp!=null;tmp=tmp.getNext())
			System.out.print(tmp.getData()+" --> ");
		System.out.println("NULL");
	}

}
