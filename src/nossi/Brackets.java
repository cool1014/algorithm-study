package nossi;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    public int solution(String s) {
        int answer = 0;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == '{') {
                stack.push('{');
            } else if (s.charAt(i) == '[') {
                stack.push('[');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return -1;
                if (stack.peek() == '(') {
                    stack.pop();
                    answer++;
                } else return -1;
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) return -1;
                if (stack.peek() == '{') {
                    stack.pop();
                    answer++;
                } else return -1;
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) return -1;
                if (stack.peek() == '[') {
                    stack.pop();
                    answer++;
                } else return -1;
            }
        }

        return stack.isEmpty() ? answer : -1;
    }
}
