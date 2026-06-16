package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1959. 두 개의 숫자열 (260616)
 *
 * 시간복잡도 : O(N^2)
 * - n과m이 같으면 최대
 *
 * 풀이과정
 * - 1.두 배열 중 짧은 배열을 긴 배열 위에서 슬라이딩
 * - 2. 슬라이딩 가능한 횟수 = (긴 길이 - 짧은 길이 + 1)번
 * - 3. 각 위치에서 겹치는 원소끼리 곱한 합을 계산하여 최댓값 출력
 */
public class T1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            int maxV = -10000000;
            if (n < m) {
                for (int r = 0; r < m - n + 1; r++) {
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr1[i] * arr2[i + r];
                    }
                    maxV = Math.max(maxV, sum);
                }
            } else {
                for (int r = 0; r < n - m + 1; r++) {
                    int sum = 0;
                    for (int i = 0; i < m; i++) {
                        sum += arr2[i] * arr1[i + r];
                    }
                    maxV = Math.max(maxV, sum);
                }
            }
            System.out.println("#" + tc + " " + maxV);
        }
    }
}
