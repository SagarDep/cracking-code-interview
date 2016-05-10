package array.strings;

/**
 * @description Write code to reverse a C-Style String
 * @author mlabouar
 *
 */
public class Ex2 {

	// hello  --> olleh

	public String reverseCStyleString(String str){
		StringBuffer reversed=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

}
