package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//베시와 데이지
public class N16431 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bessieX = Integer.parseInt(st.nextToken());
        int bessieY = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int daisyX = Integer.parseInt(st.nextToken());
        int daisyY = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int johnX = Integer.parseInt(st.nextToken());
        int johnY = Integer.parseInt(st.nextToken());

        int daisyCount = Math.abs(daisyX - johnX) + Math.abs(daisyY - johnY);
        int bessieMin = Math.min(Math.abs(bessieX - johnX), Math.abs(bessieY - johnY));
        int bessieCount = Math.abs(bessieX - johnX) + Math.abs(bessieY - johnY) - bessieMin;

        if (daisyCount < bessieCount) {
            bw.write("daisy");
        } else if (daisyCount > bessieCount) {
            bw.write("bessie");
        } else {
            bw.write("tie");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16431().solution();
    }
}
