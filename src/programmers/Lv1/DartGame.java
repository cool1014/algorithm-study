package programmers.Lv1;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];  // 3번의 점수 저장
        int idx = 0;  // 현재 기회 (0, 1, 2)
        int num = 0;  // 현재 숫자

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            // 1. 숫자 처리
            if (Character.isDigit(c)) {
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    num = 10;
                    i++;
                } else {
                    num = c - '0';
                } 
            }
            // 2. 보너스 처리
            else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'S') {
                    score[idx] = (int) Math.pow(num, 1);
                } else if (c == 'D') {
                    score[idx] = (int) Math.pow(num, 2);
                } else if (c == 'T') {
                    score[idx] = (int) Math.pow(num, 3);
                }
                idx++;
            }
            // 3. 옵션 처리
            else if (c == '*') {
                score[idx - 1] *= 2;
                if (idx - 2 >= 0) {
                    score[idx-2] *= 2;
                }
            } else if (c == '#') {
                score[idx-1] *= -1;
            }
        }

        return score[0] + score[1] + score[2];
    }
}
