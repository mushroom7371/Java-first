package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//스캐너
public class N3035 {
    //2차원 배열에 대한 설명은 N9455 참고. 기본 골자는 참조의 참조
    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken()); //주어진 신문의 행에 해당 되는 길이
        int column = Integer.parseInt(st.nextToken());  //주어진 신문의 열에 해당되는 길이
        int multiplyRow = Integer.parseInt(st.nextToken()); //행의 배율
        int multiplyColumn = Integer.parseInt(st.nextToken());  //열의 배율
        String[][] inputArray = new String[row][column];    //데이터를 담을 초기 배열
        String[][] resultArray = new String[multiplyRow*row][multiplyColumn*column];    //배율이 적용된 데이터를 담을 배열

        for(int i = 0; i < row; i++){   //반복을 통해 1차원 배열의 인덱스 i가 다음의 1차원 배열을 가리키도록 함
            inputArray[i] = br.readLine().split("");
        }

        for(int i = 0; i < resultArray.length; i++){
            for(int j = 0; j < resultArray[0].length; j++){
                resultArray[i][j] = inputArray[i/multiplyRow][j/multiplyColumn];    //곱 배율만큼을 나눈 인덱스를 저장한다. ex)0,1 -> 0/ 2,3-> 1 ...
                bw.write(resultArray[i][j]);
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N3035().solution();
    }
}
