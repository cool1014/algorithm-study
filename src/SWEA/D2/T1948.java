package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1948. 날짜 계산기 (260617)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1. 각 월의 최대 일수를 배열에 저장
 * - 2. 종료일 - 시작일 + 1 로 일 수 차이를 결과에 저장
 * - 3. 시작월부터 종료월 직전까지 배열을 순회하여 전체 일수를 결과에 누적
 */
public class T1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int result = d2 - d1 + 1;

            for (int i = m1; i < m2; i++) {
                result += date[i];
            }

            System.out.println("#" + tc + " " + result);

        }
    }
}
