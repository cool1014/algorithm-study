package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1284. 수도 요금 경쟁 (260628)
 * <p>
 * 시간복잡도 : O(1)
 * <p>
 * 풀이과정
 * - 1. A사와 B사의 요금 계산 후 저렴한 가격 출력
 */
public class T1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int p= Integer.parseInt(st.nextToken());
            int q= Integer.parseInt(st.nextToken());
            int r= Integer.parseInt(st.nextToken());
            int s= Integer.parseInt(st.nextToken());
            int w= Integer.parseInt(st.nextToken());

            int a = p * w;
            int b = q;

            if (r < w) {
                b = b + (w-r)*s;
            }

            System.out.println("#"+tc+" " + Math.min(a, b));
        }
    }
}
