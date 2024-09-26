package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//모험의 시작
public class N31789 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfWeapons = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int money = Integer.parseInt(st.nextToken());
        int hooanAttack = Integer.parseInt(st.nextToken());

        boolean isPossible = false;
        for (int i = 0; i < numberOfWeapons; i++) {
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int att = Integer.parseInt(st.nextToken());

            if (price <= money && att > hooanAttack) {
                isPossible = true;
                break;
            }
        }

        if (isPossible) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31789().solution();
    }
}
