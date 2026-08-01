package programmers.Lv1;

import java.util.Arrays;

/**
 * [programmers] 예산 (260801)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - 부서 지원 금액을 오름차순으로 정렬한 후 예산에서 빼주고 예산이 음수가 되면 리턴
 */
public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
