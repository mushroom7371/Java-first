package BaekJoon;

import java.io.*;

//홀짝홀짝
public class N31867 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split("");

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < length; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            bw.write("0");
        } else if (evenCount < oddCount) {
            bw.write("1");
        } else {
            bw.write("-1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31867().solution();
    }
}
