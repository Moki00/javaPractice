import java.util.HashMap;
import java.util.Map;

class Dominator {
    public int dominator(int[] A) {
        
        if(A.length<1){
            return -1;
        }

        int halfDomi = A.length/2;
        int domi = -1;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : A){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue()>halfDomi){
                domi = e.getKey();
            }
        }

        for(int i=0; i<A.length; i++){
           if(A[i]==domi){
                return i;
            }
        }
 
        // no dominator
        return domi;

    }
}