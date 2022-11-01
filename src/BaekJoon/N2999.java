package BaekJoon;

import java.io.*;

//비밀 이메일
public class N2999 {
    //암호화를 요구하는줄 알고 잘못 풀다가 한참을 헤메었다. 암호화 된 문자열을 복호화 하는게 문제.
    //처음엔 이해를 못해 배열을 손으로 그려보니 바로 이해 가능했음.

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int row = 0;    //정인이가 암호화 할때의 행
        int column = 0; //정인이가 암호화 할때의 열

        for(int i = 1; i <= input.length(); i++){   //입력 문자열의 길이를 가지고 N*M의 행렬을 만들기 위한 반복 
            int tempColumn = input.length();    //문자열의 길이를 열의 길이로 임시저장

            for(int j = tempColumn; j >= i; j--){   //행과 열을 구할 반복, 굳이 행의 길이가 열의 길이보다 작거나 같다라는 조건을 안넣은 것은 j >= i 가 있기 때문이다
                if(i * j == tempColumn){
                    row = i;
                    column = j;
                }
            }
            //위에서 알맞는 조건의 행,열을 설정해 준다. i의 최대를 구할 로직은 맨위의 for문에서 이루어지게 되는 셈이다.
        }

        char[][] jungInArray = new char[column][row];
        //여기서 핵심. 문제는 암호화를 하는게 아니라 복호화를 요구한다. 때문에, 행과 열이 바뀐 배열을 선언해야 된다. 손그림으로 조건을 맞춰 보면 이해가 바로감
        int startIndex = 0; //subString을 이용할 것이라 인덱스 설정을 해준다.
        int endIndex = row; //사실 여기서의 row는 행이 아니라 열이 되는셈

        for(int i = 0; i < column; i++){
            String temp = input.substring(startIndex, endIndex);    //해당 인덱스 만큼 자른 임시 String값으로

            for(int j = 0; j < temp.length(); j++){ //배열에 저장
                jungInArray[i][j] = temp.charAt(j);
            }

            startIndex += row;  //여기서 인덱스의 증가가 이뤄진다.
            endIndex += row;
        }

        for(int i = 0; i < jungInArray[0].length; i++){
            for(int j = 0; j < jungInArray.length; j++){
                bw.write(jungInArray[j][i]);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N2999().solution();
    }
}
