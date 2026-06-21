package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1945. 간단한 소인수분해 (260620)
 *
 * 시간복잡도 : O(logN)
 *
 * 풀이과정
 * - 1. 소인수분해 숫자를 nums에 저장하고 count 배열 생성
 * - 2. 각 숫자마다 나눠서 0이 되지 않을 때까지 반복
 * - 3. 각 숫자의 카운트 출력
 */
public class T1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[] counts = new int[5];
            int[] nums = {2, 3, 5, 7, 11};

            for (int i = 0; i < 5; i++) {
                while (n % nums[i] == 0) {
                    n = n / nums[i];
                    counts[i]++;
                }
            }
            System.out.println("#"+tc+" " + counts[0] + " " + counts[1] + " " + counts[2] + " "+ counts[3] + " "+ counts[4]);
        }
    }
}
