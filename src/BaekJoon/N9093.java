package BaekJoon;

import java.io.*;

//단어 뒤집기
public class N9093 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            String[] input = br.readLine().split(" ");  //입력 문자열을 공백 단위로 잘라 배열에 저장

            for(int i = 0; i < input.length; i++){  //각 단어의 길이만큼 반복
                for(int j = input[i].length() - 1; j >= 0; j--){    //맨뒤의 인덱스 부터 맨 앞까지
                    bw.write(input[i].charAt(j));   //해당 인덱스의 문자를 버퍼에 기록
                }
                bw.write(" ");  //단어마다 띄어뜨기
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N9093().solution();
    }
}
