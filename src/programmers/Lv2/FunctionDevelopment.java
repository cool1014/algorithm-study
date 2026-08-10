package programmers.Lv2;

import java.util.*;

public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int n = progresses.length;
        int cool = 0;

        while (true) {
            if (cool == n) {
                break;
            }

            for (int i = 0; i < n; i++) {
                progresses[i] += speeds[i];
            }

            int cnt = 0;

            for (int i = cool; i < n; i++) {
                if (progresses[i] >= 100) cnt++;
                else break;
            }

            if (cnt > 0) {
                list.add(cnt);
                cool += cnt;
            }

        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
