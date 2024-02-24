package BaekJoon;

import java.io.*;

//시간복잡도를 배운 도도
public class N24510 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());

        int count = 0;
        while (c --> 0) {
            String input = br.readLine();

            input = input.replaceAll("for", "1");
            input = input.replaceAll("while", "1");
            int temp = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '1') {
                    temp++;
                }
            }

            count = Math.max(count, temp);
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24510().solution();
    }
}
