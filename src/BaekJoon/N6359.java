package BaekJoon;

import java.io.*;

//만취한 상범
public class N6359 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfRoom = Integer.parseInt(br.readLine());
            boolean [] roomStatusArray = new boolean[numberOfRoom+1];
            int index = 0;
            int count = 0;

            while (index <= numberOfRoom) {
                index++;

                for (int i = index; i <= numberOfRoom; i+=index) {
                    roomStatusArray[i] = !roomStatusArray[i];
                }
            }

            for (int i = 1; i <= numberOfRoom; i++) {
                if (roomStatusArray[i]) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6359().solution();
    }
}
