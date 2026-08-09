package programmers.Lv1;

public class FlexibleWork {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int i = 0; i < schedules.length; i++) {
            int curday = startday;
            int flag = 1;
            int cool = schedules[i] + 10;
            if (cool % 100 >= 60) cool = cool - 60 + 100;
            for (int j = 0; j < 7; j++) {
                if (curday == 8) curday = 1;

                if (curday == 6 || curday == 7) {
                    curday++;
                } else {
                    if (cool < timelogs[i][j]) {
                        flag = 0;
                    }
                    curday++;
                }

            }
            if (flag == 1) answer++;

        }

        return answer;
    }
}
