package BaekJoon;

import java.io.*;

//등장하지 않는 문자의 합
public class N3059 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int [] alphabetArray = new int[26];
            String inputString = br.readLine();
            int sum = 0;

            for(int i = 0; i < inputString.length(); i++){
                int num = inputString.charAt(i) - 'A';
                alphabetArray[num]++;
            }

            for (int i = 0; i < alphabetArray.length; i++) {
                if(alphabetArray[i] == 0){
                    sum += i + 65;
                }
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3059().solution();
    }
}
