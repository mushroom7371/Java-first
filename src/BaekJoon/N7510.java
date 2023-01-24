package BaekJoon;

import java.io.*;
import java.util.Arrays;

//고급 수학
public class N7510 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            int [] triangleInfoArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int a = triangleInfoArray[0];
            int b = triangleInfoArray[1];
            int c = triangleInfoArray[2];

            if (c*c == a*a + b*b) {
                bw.write("Scenario #" + i + ":\n" + "yes\n\n");
            }else {
                bw.write("Scenario #" + i + ":\n" + "no\n\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N7510().solution();
    }
}
