package BaekJoon;

import java.io.*;

//자석 체인
public class N17201 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfMagnets = Integer.parseInt(br.readLine());
        String[] magnetArr = br.readLine().split("");

        boolean isPossible = true;
        String initialMagnet = magnetArr[0];
        for (int i = 0; i < magnetArr.length; i += 2) {
            if (!initialMagnet.equals(magnetArr[i])) {
                isPossible = false;
                break;
            }
        }

        bw.write(isPossible ? "Yes" : "No");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17201().solution();
    }
}
