package BaekJoon;

import java.io.*;
import java.util.Arrays;

//삼각형과 세 변
public class N5073 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while (!(input = br.readLine()).equals("0 0 0")){
            int [] inputArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int first = inputArray[2];
            int second = inputArray[1];
            int third = inputArray[0];

            if (first == second && second == third) {
                bw.write("Equilateral\n");
            }

            if ((first == second && second != third) || (first != second && second == third)) {
                if (first >= second + third) {
                    bw.write("Invalid\n");
                }else {
                    bw.write("Isosceles\n");
                }
            }

            if (first != second && second != third) {
                if (first >= second + third) {
                    bw.write("Invalid\n");
                }else {
                    bw.write("Scalene\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5073().solution();
    }
}
