import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    static void check(String s)
    {
        // declare a HashMap named 'map'
        HashMap<Character,Integer> map;

        // create a HashMap object using new 'map'
        map =new HashMap<>();

        // loop thru each char in the string labeled as 's'
        for(int i=0;i<s.length();i++)

        {char c=s.charAt(i);
            if(!map.containsKey(c))
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }

        for (char e:map.keySet()) {
            int num = map.get(e);
            if(num==1)
                System.out.println("There is "+num+" '"+e+"'.");
            else
            System.out.println("There are "+num+" '"+e+"'s.");
        }

//        Iterator<Character> itr = map.keySet().iterator();
//        while (itr.hasNext()) {
//            Object x=itr.next();
//            System.out.println("count of "+x+" : "+map.get(x));
//        }
    }

    public static void main(String[] args)
    {
        String s="hellooooooo";
        check(s);
    }
}
