package BaekJoon;

import java.io.*;

//텔레프라임
public class N7789 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int originNumber = Integer.parseInt(input[0]);
        int afterNumber = Integer.parseInt(input[1] + input[0]);

        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(originNumber); i++) {
            if (originNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        for (int i = 2; i < Math.sqrt(afterNumber); i++) {
            if (afterNumber % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N7789().solution();
    }
}
