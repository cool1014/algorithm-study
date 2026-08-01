package programmers.Lv1;

/**
 * [programmers] 소수 만들기 (260801)
 *
 * 시간복잡도 : O(N^3)
 * - 3중 반복문
 *
 * 풀이과정
 * - 세 숫자를 더한 후 소수이면 +
 */
public class MakingPrimeNumbers {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {

                    boolean isPrime = true;

                    int num = nums[i] + nums[j] + nums[k];
                    for (int p = 2; p * p <= num; p++) {
                        if (num % p == 0) isPrime = false;
                    }

                    if (isPrime) answer++;
                }
            }
        }

        return answer;
    }
}
