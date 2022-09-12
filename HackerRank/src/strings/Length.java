package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Length {

    public static void main(String[] args) {
        
        String h= "hello";
        String j= "java";
        
        // sum of hello java = 9
        int hLength = h.length();
        int jLength = j.length();
        System.out.println(hLength+jLength);
        
        // Lexicographical order
        List<String> words = Arrays.asList(h, j);
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
//        System.out.println(words);  // the list
//        System.out.println(words.get(0)); // the first word
        if (words.get(0)==h) {
        	System.out.println("No");
        } else {
        	System.out.println("Yes");
        }
        
        // Capitalize first letter
         String hCap = h.substring(0,1).toUpperCase()+ h.substring(1).toLowerCase();
         String jCap = j.substring(0,1).toUpperCase()+ j.substring(1).toLowerCase();
         System.out.println(hCap+" "+jCap);
    }
}



