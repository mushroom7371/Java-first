package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//유레카 이론
public class N10448 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> triangleNumbers = new ArrayList<>();

        while (true) {
            int number = triangleNumbers.size() + 1;
            int triangleNumber = number * (number + 1) / 2;

            if (triangleNumber > 1000) {
                break;
            }
            triangleNumbers.add(triangleNumber);
        }

        int testCase = Integer.parseInt(br.readLine());
        while (testCase --> 0) {
            int targetNumber = Integer.parseInt(br.readLine());
            boolean isTriangle = false;

            for (int i = 0; i < triangleNumbers.size(); i++) {
                for (int j = 0; j < triangleNumbers.size(); j++) {
                    for (int k = 0; k < triangleNumbers.size(); k++) {
                        if (triangleNumbers.get(i) + triangleNumbers.get(j) + triangleNumbers.get(k) == targetNumber) {
                            isTriangle = true;
                            break;
                        }
                    }
                }
            }

            if (isTriangle) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10448().solution();
    }
}
