package BaekJoon;

import java.io.*;

//Sounds fishy!
public class N6764 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());
        int fourth = Integer.parseInt(br.readLine());

        if (first < second && second < third && third < fourth) {
            bw.write("Fish Rising");
        } else if (first > second && second > third && third > fourth) {
            bw.write("Fish Diving");
        } else if (first == second && second == third && third == fourth) {
            bw.write("Fish At Constant Depth");
        } else {
            bw.write("No Fish");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6764().solution();
    }
}
