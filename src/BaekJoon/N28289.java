package BaekJoon;

import java.io.*;

//과 조사하기
public class N28289 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());

        int[] countArr = new int[4];
        while (numberOfPeople --> 0) {
            String[] studentInfo = br.readLine().split(" ");
            if (studentInfo[0].equals("1")) {
                countArr[3]++;
            } else {
                if (studentInfo[1].equals("1") || studentInfo[1].equals("2")) {
                    countArr[0]++;
                } else if (studentInfo[1].equals("3")) {
                    countArr[1]++;
                } else {
                    countArr[2]++;
                }
            }
        }

        for (int i = 0; i < countArr.length; i++) {
            bw.write(countArr[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28289().solution();
    }
}
