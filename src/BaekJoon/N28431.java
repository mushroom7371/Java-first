package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//양말 짝맞추기
public class N28431 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> socks = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            int sock = Integer.parseInt(br.readLine());
            socks.put(sock, socks.getOrDefault(sock, 0) + 1);
        }

        for (int sock : socks.keySet()) {
            if (socks.get(sock) % 2 != 0) {
                bw.write(sock + "");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28431().solution();
    }
}
