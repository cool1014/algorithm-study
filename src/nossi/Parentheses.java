package nossi;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 시간복잡도 : O(N)
 */
public class Parentheses {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return -1;

                stack.pop();
                answer++;
            }
        }

        return stack.isEmpty() ? answer : -1;
    }
}
