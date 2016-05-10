package test;

import java.util.stream.Stream;

import array.strings.Ex4;
import array.strings.Ex5;
import array.strings.Ex8;
import linkedlists.CharList;
import linkedlists.LinkedList;

public class Main {

	public static void main(String[] args) {
		CharList l1=new CharList();
		l1.appendToTail('a');
		l1.appendToTail('b');
		l1.appendToTail('c');
		l1.appendToTail('d');
		l1.appendToTail('e');

		l1.printNodes();
		l1.delete(l1.find('e'));
		l1.printNodes();
	}

}
