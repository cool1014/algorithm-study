package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * [SWEA] 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기 (260628)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1. HashMap을 사용하여 1000명의 점수를 key, 횟수를 value에 저장
 * - 2. 최대 점수와 최대 횟수 변수 생성
 * - 3. Map을 돌며 횟수가 클 때 혹은 횟수가 같은데 점수가 클 때 최대 점수와 횟수 초기화
 * - 4. 최빈수 중 가장 큰 값 출력
 */
public class T1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int cool = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Map<Integer, Integer> scores = new HashMap<>();

            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                scores.put(score, scores.getOrDefault(score, 0) + 1);
            }

            int maxK = 0;
            int maxV = 0;
            for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
                int curK = entry.getKey();
                int currentV = entry.getValue();

                if (currentV > maxV || (maxV == currentV && curK > maxK)) {
                    maxK = curK;
                    maxV = currentV;
                }
            }

            System.out.println("#" + tc + " " + maxK);


        }
    }
}
