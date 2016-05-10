package array.strings;

import java.util.Arrays;

/**
 *
 * @description "waterbottle" "erbottlewat"
 * @author mlabouar
 *
 */
public class Ex8 {

	public boolean isRotation(String s1, String s2){
		char[] charS1=s1.toCharArray();
		char[] charS2=s2.toCharArray();
		Arrays.sort(charS1);
		Arrays.sort(charS2);
		return String.valueOf(charS1).compareTo(String.valueOf(charS2)) == 0;
	}

}
