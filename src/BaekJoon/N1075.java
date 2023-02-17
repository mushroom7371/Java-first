package BaekJoon;

import java.io.*;

//나누기
public class N1075 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNumber = Integer.parseInt(br.readLine());
        int divisionNumber = Integer.parseInt(br.readLine());
        int result = 0;
        inputNumber = (inputNumber/100)*100;

        for (int i = 0; i < 100; i++) {
            if (inputNumber%divisionNumber == 0) {
                result = inputNumber%100;
                break;
            }
            inputNumber++;
        }

        if (result < 10) {
            bw.write("0" + result);
        } else {
            bw.write(result + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1075().solution();
    }
}
