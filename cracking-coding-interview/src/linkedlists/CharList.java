package linkedlists;

public class CharList {
	private Data root;

	public CharList() {

	}

	public void appendToTail(char data) {
		Data e=new Data(data);
		if (root == null) {
			root = e;
		} else {
			Data tmp = root;
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
		Data tmp = root;
		while (tmp != null) {
			System.out.print(tmp.getData() + " -> ");
			tmp = tmp.getNext();
		}
		System.out.println("NULL");
	}

	public Data find(char data){
		Data tmp=root;
		while(tmp!=null){
			if(tmp.getData()==data){
				return tmp;
			}
			tmp=tmp.getNext();
		}
		return null;
	}

	public void delete(Data node){
		if(node==null)
			return;
		if(node==root){
			root=root.getNext();
		}else{
			Data tmp=root;
			Data prev=root;
			while(tmp!=null){
				if(tmp.getData()==node.getData()){
					prev.setNext(tmp.getNext());
				}
				prev=tmp;
				tmp=tmp.getNext();
			}
		}
	}
}
