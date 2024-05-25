package BaekJoon;

import java.io.*;

//Ahmed Aly
public class N10698 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        int count = 0;
        while (testCase-- > 0) {
            count++;
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[2]);
            int c = Integer.parseInt(input[4]);
            int result = 0;

            if (input[1].equals("+")) {
                result = a + b;
            } else if (input[1].equals("-")) {
                result = a - b;
            }

            if (result == c) {
                bw.write("Case " + count + ": YES\n");
            } else {
                bw.write("Case " + count + ": NO\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10698().solution();
    }
}
