package BaekJoon;

import java.io.*;

//세로읽기
public class N10798 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] inputArray = new String[5][15];  //5줄의 최대 15자의 입력이 주어지므로 이를 담을 2차원 배열 생성

        for(int i = 0; i < 5; i++){
            String tempString = br.readLine();

            for(int j = 0; j < 15; j++){    //15자가 아닐수도 있기에 문자열의 길이를 넘는 경우는 빈 String 으로 남겨둠
                if(j > tempString.length() - 1){
                    inputArray[i][j] = "";
                }else{
                    inputArray[i][j]= tempString.charAt(j) + "";
                }
            }
        }

        for(int i = 0; i < 15; i++){    //15자 만큼 반복
            for(int j = 0; j < 5; j++){ //5만큼 반복
                if(!inputArray[j][i].equals("")){   //빈 문자열이 아니라면 버퍼에 기록
                    bw.write(inputArray[j][i]);
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10798().solution();
    }
}
