package nossi;

import java.util.HashSet;
import java.util.Set;

/**
 * 시간복잡도 : O(N)
 */
public class FreeEvent {
    public int solution(int[] prices, int target) {
        int answer = 0;

        Set<Integer> cool = new HashSet<>();
        for (int i = 0; i < prices.length; i++) {
            if (cool.contains(target - prices[i])) {
                answer ++;
            }
            cool.add(prices[i]);
        }

        return answer;
    }
}
