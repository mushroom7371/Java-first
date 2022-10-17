package BaekJoon;

import java.io.*;

//행복한지 슬픈지
public class N10769 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String message = br.readLine();
        String[] happySplit = message.split(":-\\)");   //행복한 이모티콘을 기준으로 문자열을 가르고 배열에 저장
        String[] sadSplit = message.split(":-\\("); //슬픈 이모티콘을 기준으로 문자열을 가르고 배열에 저장
        int happyCount = happySplit.length - 1 ;    //행복한 이모티콘의 개수는 배열의 길이 -1이 된다.
        int sadCount = sadSplit.length - 1 ;    //위와 마찬가지

        if(happyCount == 0 && sadCount == 0){   //카운트가 0인 경우는 이모티콘을 사용하지 않은 경우다
            bw.write("none");
        }else{
            if(happyCount > sadCount){  //행복한 경우
                bw.write("happy");
            }else if(happyCount < sadCount){    //슬픈 경우
                bw.write("sad");
            }else{  //같은 경우
                bw.write("unsure");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10769().solution();
    }
}
