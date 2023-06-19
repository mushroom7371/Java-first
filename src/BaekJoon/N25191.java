package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//치킨댄스를 추는 곰곰이를 본 임스
public class N25191 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int kindOfChicken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfCola = Integer.parseInt(st.nextToken());
        int numberOfBeer = Integer.parseInt(st.nextToken());

        int result = numberOfCola/2 + numberOfBeer;

        if (result > kindOfChicken) {
            bw.write(kindOfChicken + "");
        } else {
            bw.write(result + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25191().solution();
    }
}
