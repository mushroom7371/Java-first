package BaekJoon;

import java.io.*;

//점화식
public class N13699 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        long[] numberArray = new long[36];

        numberArray[0] = 1;
        numberArray[1] = 1;

        for(int i = 2; i < 36; i++){    //0,1 번지는 1로 이미 설정되어 있으므로 2~35번지 까지 반복
            for(int j = 0; j < i; j++){ //대칭을 이루는 번지를 핸들링 할것이므로 j는 i 전까지 반복
                numberArray[i] += (numberArray[j] * numberArray[i - j - 1]);    //i번지의 데이터는 j번지 + (i - j -1)번지의 곱을 더해준 것과 같다.
            }
        }

        bw.write(numberArray[number] + "");
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N13699().solution();
    }
}
