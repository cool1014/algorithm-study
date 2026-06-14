package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1961. 숫자 배열 회전 (260614)
 *
 * 시간복잡도 : O(N^2)
 *
 * 풀이과정
 * - 1. 주어진 숫자들을 배열에 저장
 * - 2. 90도 회전하는 함수 구현
 * - 3. 90도, 180도, 270도 회전한 배열을 따로 저장
 * - 4. StringBuilder에 저장하여 출력
 */
public class T1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] arr90 = rotation90(arr, n);
            int[][] arr180 = rotation90(arr90, n);
            int[][] arr270 = rotation90(arr180, n);

            StringBuilder sb = new StringBuilder();
            sb.append("#" + tc).append("\n");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(arr90[i][j]);
                }
                sb.append(" ");

                for (int j = 0; j < n; j++) {
                    sb.append(arr180[i][j]);
                }
                sb.append(" ");

                for (int j = 0; j < n; j++) {
                    sb.append(arr270[i][j]);
                }
                sb.append("\n");
            }

            System.out.print(sb);
        }
    }
    public static int[][] rotation90(int[][] lst, int n) {
        int[][] newArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[j][n - 1 - i] = lst[i][j];
            }
        }

        return newArr;
    }
}
