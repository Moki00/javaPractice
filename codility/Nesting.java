public class Nesting {
    public int solution(String S) {
        int eq = 0;

        for(char c: S.toCharArray()){
            if(c=='('){
                eq++;
            } else if(c==')'){
                eq--;
            }
            if(eq<0){
                return 0;
            }
        }

        if(eq==0){
            return 1;
        }
        return 0;
    }
}
