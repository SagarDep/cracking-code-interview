package test;

import java.util.stream.Stream;

import array.strings.Ex4;
import array.strings.Ex5;
import array.strings.Ex8;
import linkedlists.CharList;
import linkedlists.LinkedList;
import stack.queues.Queue;
import stack.queues.Stack;

public class Main {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(5);
		q.print();
		q.dequeue();
		q.dequeue();
		q.print();
	}

}
