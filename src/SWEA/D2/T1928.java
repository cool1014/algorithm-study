package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [SWEA] 1928. Base64 Decoder
 */
public class T1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            String str = br.readLine();
            sb.append("#").append(tc).append(" ");

            for (int i = 0; i < str.length(); i += 4) {
                StringBuilder binaryStr = new StringBuilder();

                for (int j = 0; j < 4; j++) {
                    char c = str.charAt(i + j);
                    int idx = base64.indexOf(c);

                    String binary = Integer.toBinaryString(idx);

                    while (binary.length() < 6) {
                        binary = "0" + binary;
                    }

                    binaryStr.append(binary);
                }

                for (int j = 0; j < 24; j += 8) {
                    String byteStr = binaryStr.substring(j, j + 8);

                    int ascii = Integer.parseInt(byteStr, 2);

                    sb.append((char) ascii);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}