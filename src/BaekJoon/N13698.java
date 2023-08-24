package BaekJoon;

import java.io.*;

//Hawk eyes
public class N13698 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] cups = {1, 0, 0, 2};
        String input = br.readLine();

        int a = 0;
        int b = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case'A':
                    a = 0; b = 1;
                    break;
                case 'B':
                    a = 0; b = 2;
                    break;
                case 'C':
                    a = 0; b = 3;
                    break;
                case 'D':
                    a = 1; b = 2;
                    break;
                case 'E':
                    a = 1; b = 3;
                    break;
                case 'F':
                    a = 2; b = 3;
                    break;
            }

            cups = swap(cups, a, b);
        }

        int big = 0;
        int small = 0;
        for (int i = 0; i < cups.length; i++) {
            if (cups[i] == 1) {
                small = i + 1;
            } else if (cups[i] == 2) {
                big = i + 1;
            }
        }

        bw.write(small + "\n" + big);

        br.close();
        bw.flush();
        bw.close();
    }

    int[] swap(int[] cups, int a, int b) {
        int temp = cups[a];
        cups[a] = cups[b];
        cups[b] = temp;

        return cups;
    }

    public static void main(String[] args) throws IOException {
        new N13698().solution();
    }
}
