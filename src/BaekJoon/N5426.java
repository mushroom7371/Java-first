package BaekJoon;

import java.io.*;

//비밀 편지
public class N5426 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            String input = br.readLine();
            int length = (int)Math.sqrt(input.length());    //길이는 항상 제곱수로 주어지기에 제곱근으로 길이를 구해 준다.
            char[][] secret = new char[length][length]; //정사각 행렬 모양의 2차원 배열을 생성
            int index = 0;  //문자열 인덱스를 가리킬 변수

            for(int i = 0; i < length; i++){
                for(int j = 0; j < length; j++){
                    secret[i][j] = input.charAt(index); //비밀 편지를 배열에 저장
                    index++;
                }
            }

            for(int i = length-1; i >= 0; i--){ //배열의 오른쪽에서 왼쪽으로, 위에서 아래로 문자를 버퍼에 기록
                for(int j = 0; j < length; j++){
                    bw.write(secret[j][i]);
                }
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N5426().solution();
    }
}
