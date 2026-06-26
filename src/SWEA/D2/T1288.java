package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * [SWEA] 1288. 새로운 불면증 치료법 (260626)
 *
 * 시간복잡도 : O(1)
 *
 * 풀이과정
 * - 1. 숫자를 문자열로 받고 각 자릿수를 int 형변환 후 HashSet에 저장
 * - 2. count를 하나씩 올리며 Set에 모든 숫자가 들어갈 때까지 반복 후 들어가면 최댓값 출력
 */
public class T1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String n = br.readLine();
            Set<Integer> numbers = new HashSet<>();

            for (int i = 0; i < n.length(); i++) {
                int num = n.charAt(i) - '0';
                numbers.add(num);
            }

            int maxV = Integer.parseInt(n);
            int cnt = 2;
            while (numbers.size() < 10) {
                int number = Integer.parseInt(n) * cnt;
                String numStr = String.valueOf(number);

                for (int i = 0; i < numStr.length(); i++) {
                    int num = numStr.charAt(i) - '0';
                    numbers.add(num);
                }
                cnt++;
                maxV = Integer.parseInt(numStr);
            }


            System.out.println("#" + tc + " " + maxV);
        }
    }
}
