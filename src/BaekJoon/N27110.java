package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//특식 배부
public class N27110 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfChickens = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int friedChicken = Integer.parseInt(st.nextToken());
        int soySauceChicken = Integer.parseInt(st.nextToken());
        int seasonedChicken = Integer.parseInt(st.nextToken());

        int result = 0;

        if (numberOfChickens >= friedChicken) {
            result += friedChicken;
        } else {
            result += numberOfChickens;
        }

        if (numberOfChickens >= soySauceChicken) {
            result += soySauceChicken;
        } else {
            result += numberOfChickens;
        }

        if (numberOfChickens >= seasonedChicken) {
            result += seasonedChicken;
        } else {
            result += numberOfChickens;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27110().solution();
    }
}
