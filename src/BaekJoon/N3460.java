package BaekJoon;

import java.io.*;

//이진수
public class N3460 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int number = Integer.parseInt(br.readLine());
            String binaryString = Integer.toBinaryString(number);   //10진수 int를 -> 2진수 String으로 변환

            for(int i = binaryString.length() -1 ; i >= 0; i--){    //뒷자리부터 검색하기 위해 반복 설정
                if(binaryString.charAt(i) != '0'){  //0이 아니라면
                    bw.write(binaryString.length() -1 -i + " ");    //해당 인덱스값(뒤부터 시작) 기록
                }
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N3460().solution();
    }
}
