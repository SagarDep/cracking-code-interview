package array.strings;

import java.util.Arrays;

/**
 * @description test if two strings are anagrams
 * @author mlabouar
 *
 */
public class Ex4 {

	//car | arc
	//elvis | lives
	//action man | cannot aim

	public boolean isAnagram(String s1, String s2){
		char[] charS1 = s1.toCharArray();
		Arrays.sort(charS1);
		char[] charS2 = s2.toCharArray();
		Arrays.sort(charS2);
		return String.valueOf(charS1).compareTo(String.valueOf(charS2))==0;
	}

}
