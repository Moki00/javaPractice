import java.util.ArrayDeque;
import java.util.Deque;

public class Nested {
    public int nested(String S) {

        Deque<Character> stack = new ArrayDeque<>();

        for(char c: S.toCharArray()){
            if (c=='(' || c=='[' || c=='{'){
                stack.push(c);
            } else if (c==')'){
                if(stack.isEmpty() || stack.pop()!='('){
                    return 0;
                }
            } else if (c==']'){
                if(stack.isEmpty() || stack.pop()!='['){
                    return 0;
                }
            } else if (c=='}'){
                if(stack.isEmpty() || stack.pop()!='{'){
                    return 0;
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
