package BaekJoon;

import java.io.*;
import java.util.Date;

public class N16170 {

    void solution() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Date currentDate = new Date();

        bw.write((currentDate.getYear() + 1900) + "\n" + (currentDate.getMonth() + 1) + "\n" + currentDate.getDate());

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16170().solution();
    }
}
