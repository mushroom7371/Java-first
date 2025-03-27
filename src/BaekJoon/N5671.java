package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//호텔 방 번호
public class N5671 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while ((input = br.readLine()) != null && !input.equals("")) {
            StringTokenizer st = new StringTokenizer(input);
            int startNum = Integer.parseInt(st.nextToken());
            int endNum = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int i = startNum; i <= endNum; i++) {
                int[] numCountArray = new int[10];
                String number = String.valueOf(i);
                for (int j = 0; j < number.length(); j++) {
                    numCountArray[number.charAt(j) - '0']++;
                }

                for (int j = 0; j < numCountArray.length; j++) {
                    if (numCountArray[j] > 1) {
                        count++;
                        break;
                    }
                }
            }

            bw.write((endNum - startNum + 1) - count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5671().solution();
    }
}
