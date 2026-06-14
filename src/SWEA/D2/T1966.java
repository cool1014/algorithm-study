package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [SWEA] 1966. 숫자를 정렬하자 (260614)
 *
 * 시간복잡도 : O(NlogN)
 *
 * 풀이과정
 * - 1. 주어진 숫자들을 배열에 저장
 * - 2. Array.sort() 를 활용해 오름차순 정렬
 */
public class T1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
            sb.append("#" + tc + " ");

            for (int i = 0; i < n; i++) {
                sb.append(arr[i] + " ");
            }

            System.out.println(sb);
        }
    }
}
