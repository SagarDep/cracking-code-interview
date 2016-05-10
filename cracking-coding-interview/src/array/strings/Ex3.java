package array.strings;

/**
 * @description remove the duplicate characters in a string
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {

    // hello helo
    // sanddras sandr
    // ssssshebb sheb
    public String removeDuplicate(String str){
        StringBuffer result=new StringBuffer();
        Stream.of(str.split(""))
              .forEach(c -> {
            	  if(result.indexOf(c)==-1){
                  	result.append(c);
                  }
              });
        return result.toString();
    }

}
