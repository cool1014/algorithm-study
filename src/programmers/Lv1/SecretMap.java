package programmers.Lv1;

/**
 * [programmers] 비밀지도 (260801)
 *
 * 시간복잡도 : O(N)
 *
 */
public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 1. 두 배열의 숫자를 비트 OR 연산 후 2진수 문자열로 변환
            String combinedBinary = Integer.toBinaryString(arr1[i] | arr2[i]);

            // 2. n 자릿수를 맞추기 위해 부족한 만큼 앞에 '0'을 추가
            while (combinedBinary.length() < n) {
                combinedBinary = "0" + combinedBinary;
            }

            // 3. '1'은 '#', '0'은 ' ' (공백)으로 변환
            combinedBinary = combinedBinary.replaceAll("1", "#");
            combinedBinary = combinedBinary.replaceAll("0", " ");

            answer[i] = combinedBinary;
        }

        return answer;
    }
}
