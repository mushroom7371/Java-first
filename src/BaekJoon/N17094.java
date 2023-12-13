package BaekJoon;

import java.io.*;

//Serious Problem
public class N17094 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int count = 0;

        for (int i = 0; i < size; i++) {
            char c = input.charAt(i);
            if (c == '2') {
                count++;
            } else if (c == 'e') {
                count--;
            }
        }

        if (count > 0) {
            bw.write("2");
        } else if (count < 0) {
            bw.write("e");
        } else {
            bw.write("yee");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17094().solution();
    }
}
