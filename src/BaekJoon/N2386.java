package BaekJoon;

import java.io.*;

//도비의 영어 공부
public class N2386 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) {
                break;
            }

            String [] inputArray = input.split(" ");

            char target = inputArray[0].charAt(0);
            int count = 0;

            for (int i = 1; i < inputArray.length; i++) {
                String temp = inputArray[i].toLowerCase();

                for (int j = 0; j < temp.length(); j++) {
                    if (target == temp.charAt(j)) {
                        count++;
                    }
                }
            }

            bw.write(target + " " + count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2386().solution();
    }
}
