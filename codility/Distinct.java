import java.util.HashSet;

class Distinct {
    public int solution(int[] Arr) {

        if(Arr.length<1){
            return 0;
        }

        // HashSet keeps only unique
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<Arr.length;i++){
            hs.add(Arr[i]);
        }

        // count
        return hs.size();
    }
}