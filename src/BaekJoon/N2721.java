package BaekJoon;

import java.io.*;

//삼각수의 합
public class N2721 {
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] calArray = new int[301];

        for (int i = 1; i < calArray.length; i++) {
            calArray[i] = i*(i+1)*(i+2)/2;
        }

        int testCase = Integer.parseInt(br.readLine());
        while (testCase --> 0) {
            int target = Integer.parseInt(br.readLine());
            int result = 0;

            for (int i = 1; i <= target; i++) {
                result += calArray[i];
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2721().solution();
    }
}
