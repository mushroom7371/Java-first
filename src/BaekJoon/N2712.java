package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//미국 스타일
public class N2712 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double number = Double.parseDouble(st.nextToken());
            String type = st.nextToken();

            bw.write(changeUnit(number, type) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    String changeUnit (double number, String type) {
        String result = "";
        double changedNumber = 0;
        String changedType = "";

        switch (type) {
            case "kg" :
                changedNumber = number * 2.2046;
                changedType = "lb";
                break;
            case "lb" :
                changedNumber = number * 0.4536;
                changedType = "kg";
                break;
            case "l" :
                changedNumber = number * 0.2642;
                changedType = "g";
                break;
            case "g" :
                changedNumber = number * 3.7854;
                changedType = "l";
                break;
        }

        result = String.format("%.4f", changedNumber) + " " + changedType;
        return result;
    }

    public static void main(String[] args) throws IOException {
        new N2712().solution();
    }
}
