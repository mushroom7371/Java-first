package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//과민성 대장 증후군
public class N31831 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int stress = 0;
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < days; i++) {
            stress += Integer.parseInt(st.nextToken());

            if (stress < 0) {
                stress = 0;
            }
            if (stress >= target) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31831().solution();
    }
}
