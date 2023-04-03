package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//아름다운 수
public class N2774 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            Set<Integer> numberSet = new HashSet<>();
            String number = br.readLine();

            for (int i = 0; i < number.length(); i++) {
                numberSet.add(number.charAt(i) - '0');
            }

            bw.write(numberSet.size() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2774().solution();
    }
}
