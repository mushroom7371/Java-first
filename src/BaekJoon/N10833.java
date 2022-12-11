package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사과
public class N10833 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int numberOfApplesLeft = 0;

        while(testCase --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfStudent = Integer.parseInt(st.nextToken());
            int numberOfApple = Integer.parseInt(st.nextToken());

            numberOfApplesLeft += numberOfApple % numberOfStudent;
        }

        bw.write(numberOfApplesLeft + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10833().solution();
    }
}
