package array.strings;

/**
 * @description replace all spaces in string with %20
 * @author mlabouar
 *
 */
public class Ex5 {

	// "hello med" - > "hello%20med"
	// "hello med helo" - > "hello%20med%20helo"
	// "ok   k" -> "ok%20%20%20k"

	public String replaceSpacesInString(String str){
		return str.replaceAll(" ", "%20");
	}
}
