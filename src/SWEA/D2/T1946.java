package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1946. 간단한 압축 풀기 (260620)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1. 압축한 단어의 숫자만큼 돌면서 StringBuilder에 append
 * - 2. 10번을 채우면 \n append
 */
public class T1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append("#" + tc + "\n");

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                for (int j = 0; j < num; j++) {
                    sb.append(str);
                    cnt++;
                    if (cnt == 10) {
                        cnt = 0;
                        sb.append("\n");
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
