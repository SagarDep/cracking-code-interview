package test;

import java.util.stream.Stream;

import array.strings.Ex4;
import array.strings.Ex5;
import array.strings.Ex8;
import linkedlists.CharList;
import linkedlists.LinkedList;
import stack.queues.Stack;

public class Main {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(1);
		stack.push(4);
		stack.push(3);
		stack.push(2);

		stack.print();

		stack.pop();
		stack.pop();
		stack.pop();

		stack.print();
	}

}
