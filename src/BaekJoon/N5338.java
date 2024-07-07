package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 마이크로소프트 로고
public class N5338 {

    void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("       _.-;;-._\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-;;-._|\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-''-._|");

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5338().solution();
    }
}
