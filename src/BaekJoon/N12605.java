package BaekJoon;

import java.io.*;

//단어순서 뒤집기
public class N12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            String [] wordArray = br.readLine().split(" "); //주어진 단어들을 공백을 기준으로 배열에 저장

            bw.write("Case #" + (i+1) + ": ");

            for(int j = wordArray.length - 1; j >= 0; j--){ //배열에 저장된 단어를 역순으로 출력하기 위한 반복 배열은 0번지 부터 시작이니 초기 설정을 길이 -1로 해준다.
                bw.write(wordArray[j] + " ");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
