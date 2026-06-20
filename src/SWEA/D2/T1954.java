package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1954. 달팽이 숫자 (260617)
 *
 * 시간복잡도 : O(N^2)
 *
 * 풀이과정
 * - 1. 우, 하, 상, 좌 방향벡터 di, dj 설정
 * - 2. 2차원 배열의 시작점 (0, 0)에 숫자 1을 채우고 탐색을 시작
 * - 3. 현재 방향으로 한 칸 전진한 위치(ni, nj)를 계산하여 이동 가능 여부를 확인
 *      - 격자 안이고 빈칸이면 숫자 채우고 다음으로 재귀 호출
 *      - 격자 밖이거나 빈칸이 아니면 방향 바꿔서 다음으로 재귀 호출
 * - 4. 채운 숫자의 개수(cnt)가 N * N을 넘어가면 모든 칸을 채운 것이므로 배열을 반환하고 종료
 */
public class T1954 {
    public static int[] di = {0, 1, 0, -1};
    public static int[] dj = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[n][n];
            arr[0][0] = 1;
            arr = dfs1(arr, n, 0, 0, 0, 2);

            StringBuilder sb = new StringBuilder();
            sb.append("#" + tc + "\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(arr[i][j]+ " ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }

    public static int[][] dfs1(int[][] arr, int n, int i, int j, int d, int cnt) {
        if (cnt > n*n) return arr;

        int ni = di[d] + i;
        int nj = dj[d] + j;
        if (0 <= ni && ni < n && 0 <= nj && nj < n && arr[ni][nj] == 0) {
            arr[ni][nj] = cnt;
            return dfs1(arr, n, ni, nj, d, cnt+1);
        } else {
            return dfs1(arr, n, i, j, (d+1)%4, cnt);
        }


    }

}
