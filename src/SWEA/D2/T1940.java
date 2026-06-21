package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [SWEA] 1940. 가랏! RC카 (260621)
 *
 * 시간복잡도 : O(N)
 *
 * 풀이과정
 * - 1. 속도와 거리 변수 지정
 * - 2. command가 1일때 속도 가속, 2일때 속도 감속
 * - 3. 속도를 거리에 누적
 */
public class T1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int speed = 0;
            int distance = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int command = Integer.parseInt(st.nextToken());
                int speedValue = 0;
                if (st.hasMoreTokens()) {
                    speedValue = Integer.parseInt(st.nextToken());
                }
                if (command == 1) {
                    speed += speedValue;
                } else if (command == 2) {
                    speed -= speedValue;
                    if (speed < 0) speed = 0;
                }
                distance += speed;
            }

            System.out.println("#" + tc + " " + distance);
        }
    }
}
