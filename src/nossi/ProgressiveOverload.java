package nossi;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 시간복잡도 : O(N)
 */
public class ProgressiveOverload {
    public int[] solution(int[] weights) {
        int n = weights.length;
        int[] answer = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek()[1] < weights[i]) {
                int[] prevInfo = stack.pop();
                int prev = prevInfo[0];
                answer[prev] = i - prev;
            }
            stack.push(new int[] {i, weights[i]});
        }

        return answer;
    }
}
