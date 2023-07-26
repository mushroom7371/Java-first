package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//지우개
public class N21756 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            numberList.add(i);
        }

        while (true) {
            if (numberList.size() == 1) {
                bw.write(numberList.get(0).toString());
                break;
            }

            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < numberList.size(); i++) {
                if (i % 2 == 1) {
                    temp.add(numberList.get(i));
                }
            }

            numberList = temp;
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21756().solution();
    }
}
