package BaekJoon;

import java.io.*;

//재수강
public class N31822 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine().substring(0, 5);
        int testCase = Integer.parseInt(br.readLine());

        int result = 0;
        while (testCase --> 0) {
            String target = br.readLine().substring(0, 5);
            if (input.equals(target)) {
                result++;
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31822().solution();
    }
}
