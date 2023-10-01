package BaekJoon;

import java.io.*;

//포인터 공부
public class N25703 {

        void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int numberOfPointer = Integer.parseInt(br.readLine());
            String[] pointer = new String[numberOfPointer + 1];
            pointer[0] = "a";
            pointer[1] = "ptr";
            for (int i = 2; i <= numberOfPointer; i++) {
                pointer[i] = "ptr" + i;
            }

            bw.write("int a;\n");
            for (int i = 0; i < numberOfPointer; i++) {
                StringBuilder star = new StringBuilder("*");
                for (int j = 0; j < i; j++) {
                    star.append("*");
                }
                bw.write("int " + star + pointer[i+1] + " = &" + pointer[i] + ";\n");
            }

            br.close();
            bw.flush();
            bw.close();
        }

        public static void main(String[] args) throws IOException {
            new N25703().solution();
        }
}
