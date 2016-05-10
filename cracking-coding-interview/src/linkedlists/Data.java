package linkedlists;

public class Data {
	private char data;

	private Data next;

	public Data(){}

	public Data(char data){
		this.data=data;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Data getNext() {
		return next;
	}

	public void setNext(Data next) {
		this.next = next;
	}
}
