package BaekJoon;

import java.io.*;

//2루수 이름이 뭐야
public class N17350 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());
        boolean isExist = false;

        for (int i = 0; i < numberOfPeople; i++) {
            String name = br.readLine();
            if (name.equals("anj")) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            bw.write("뭐야;");
        } else {
            bw.write("뭐야?");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17350().solution();
    }
}
