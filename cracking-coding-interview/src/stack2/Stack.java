package stack2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stack {
	private static final int SIZE=10;
	private int elements[];
	private int index;
	private int count;

	public Stack(){
		elements=new int[SIZE];
		index=-1;
	}

	public void push(int element){
		if(count == elements.length){
			int tmp[]=Arrays.copyOf(elements, elements.length);
			elements=new int[elements.length*2];
			elements=Arrays.copyOf(tmp, elements.length);

		}
		elements[++index]=element;
		count++;
	}

	public int pop(){
		int element=elements[index];
		elements[index]=-1;
		count--;
		index--;
		return element;
	}

	public int size(){
		return count;
	}

	public void print(){
		for(int i=0;i<count;i++)
			System.out.println(elements[i]);
	}

}
