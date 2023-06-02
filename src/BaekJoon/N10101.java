package BaekJoon;

import java.io.*;

//삼각형 외우기
public class N10101 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int firstAngle = Integer.parseInt(br.readLine());
        int secondAngle = Integer.parseInt(br.readLine());
        int thirdAngle = Integer.parseInt(br.readLine());

        String result = "Error";
        if (firstAngle + secondAngle + thirdAngle == 180) {
            if (firstAngle == secondAngle && secondAngle == thirdAngle) {
                result = "Equilateral";
            } else if (firstAngle == secondAngle || secondAngle == thirdAngle || firstAngle == thirdAngle) {
                result = "Isosceles";
            } else {
                result = "Scalene";
            }
        }

        bw.write(result);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10101().solution();
    }
}
