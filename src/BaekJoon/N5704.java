package BaekJoon;

import java.io.*;

//팬그램
public class N5704 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("*")) {
                break;
            }

            int[] alphabet = new int[26];
            if (input.length() < 26) {
                bw.write("N\n");
            } else{
                for (int i = 0; i < input.length(); i++) {
                    int temp = input.charAt(i) - 97;
                    if (temp >= 0 && temp <= 25) {
                        alphabet[temp]++;
                    }
                }

                boolean isPangram = true;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == 0) {
                        isPangram = false;
                        break;
                    }
                }

                if (isPangram) {
                    bw.write("Y\n");
                } else {
                    bw.write("N\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5704().solution();
    }
}
