package BaekJoon;

import java.io.*;

//학식 사주기
public class N31821 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfMenus = Integer.parseInt(br.readLine());
        int[] menu = new int[numberOfMenus];
        for (int i = 0; i < numberOfMenus; i++) {
            menu[i] = Integer.parseInt(br.readLine());
        }

        int numberOfStudents = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            int index = Integer.parseInt(br.readLine());
            result += menu[index-1];
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31821().solution();
    }
}
