import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        String s="hi from Atlanta- !";

        if(isUnique(s))
            System.out.println("This string has only unique characters");
        else
            System.out.println("All characters are not unique in this string");
    }

    static boolean isUnique(String s)
        {
            HashSet<Character> set =new HashSet<Character>();

            char repeatedChar;

            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c==' ') {
                    System.out.println("skipping over space");
                    continue;
                }
                if(set.add(c)==false){
                    repeatedChar = c;
                    System.out.println("repeated character is= "+repeatedChar);
                    return false;
                }
            }

            return true;
        }





}
