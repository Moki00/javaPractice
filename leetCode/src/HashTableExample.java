import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] arg)
    {
        // creating a hash table
        Hashtable<Integer, String> h =
                new Hashtable<>();

        Hashtable<Integer, String> h1;

        h.put(999, "This is");
        h.put(444, "put in ");
        h.put(11, "a hashTable ");
        h.put(0, "labeled as 'h'");

        // create a clone or shallow copy of hash table h
        h1 = (Hashtable<Integer, String>)h.clone();

        // check h
        System.out.println("values: " + h);

        // checking clone h1
        System.out.println("values in clone: " + h1);

        // clear hash table h
        h.clear();

        // checking hash table h
        System.out.println("after clearing: " + h);
        System.out.println("values in clone: " + h1);

    }

}
