package BaekJoon;

import java.io.*;

//간지(干支)
public class N7572 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetYear = Integer.parseInt(br.readLine());
        int[] ganArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] jiArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
        int ganIndex = -1984 % 10 + 10;
        int jiIndex = -1984 % 12 + 12;

        for (int i = 0; i < targetYear; i++) {
            ganIndex++;
            jiIndex++;
            if (ganIndex == 10) ganIndex = 0;
            if (jiIndex == 12) jiIndex = 0;
        }

        bw.write(jiArray[jiIndex] + "" + ganArray[ganIndex]);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N7572().solution();
    }
}
