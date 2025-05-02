package BaekJoon;

import java.io.*;

//이상한 나라의 암호
public class N18245 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        int index = 1;

        while (true) {
            String input = br.readLine();
            if (input.equals("Was it a cat I saw?")) {
                break;
            }
            index++;
            for (int i = 0; i < input.length(); i += index) {
                result.append(input.charAt(i));
            }
            result.append("\n");
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18245().solution();
    }
}
