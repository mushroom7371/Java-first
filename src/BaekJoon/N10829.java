package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//이진수 변환
public class N10829 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();
        List<String> result = new ArrayList<>();

        while (number.equals("0") == false) {
            long remainder = Long.parseLong(number) % 2;
            number = String.valueOf(Long.parseLong(number) / 2);

            result.add(0, String.valueOf(remainder));
        }

        if (result.get(0).equals("0")) {
            result.remove(0);
        }

        for (int i = 0; i < result.size(); i++) {
            bw.write(result.get(i));
        }

        bw.flush();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10829().solution();
    }
}
