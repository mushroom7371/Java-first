package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//사탕
public class N11256 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfCandy = Integer.parseInt(st.nextToken());
            int numberOfBox = Integer.parseInt(st.nextToken());
            int[] boxArray = new int[numberOfBox];

            for (int i = 0; i < numberOfBox; i++) {
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                boxArray[i] = r * c;
            }

            Arrays.sort(boxArray);
            int result = 0;
            for (int i = boxArray.length-1; i >= 0; i--) {
                numberOfCandy -= boxArray[i];
                result++;
                if (numberOfCandy <= 0) {
                    break;
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11256().solution();
    }
}
