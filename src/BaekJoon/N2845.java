package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//파티가 끝나고 난 뒤
public class N2845 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int peopleOfOneSquareMeter = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());
        int numberOfPeople = peopleOfOneSquareMeter * area;

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int result = Integer.parseInt(st.nextToken()) - numberOfPeople;

            bw.write(result + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2845().solution();
    }
}
