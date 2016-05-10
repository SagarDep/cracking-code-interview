package array.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @description implement an algorithm to determine if a string has all unique characters
 * @author mlabouar
 *
 */
public class Ex1 {


	public boolean isUnique(String str){
		String[] characters=str.split("");
		HashMap<String, Integer> count=new HashMap();
		for(String c:characters){
			if(count.containsKey(c)){
				count.put(c, count.get(c)+1);
				return false;
			}else{
				count.put(c, 1);
			}
		}
		return true;
	}

}
