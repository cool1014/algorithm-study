package programmers.Lv1;

import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i%5]) {
                count[0] += 1;
            }
            if (answers[i] == supo2[i%8]) {
                count[1] += 1;
            }
            if (answers[i] == supo3[i%10]) {
                count[2] += 1;
            }
        }

        int maxV = 0;
        for (int i = 0; i < 3; i++) {
            if (count[i] > maxV) maxV = count[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] == maxV) list.add(i+1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
