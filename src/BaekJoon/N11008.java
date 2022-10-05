package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//복붙의 달인
public class N11008 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            int second = 0; //실제 걸린 시간
            int count = 0;  //복붙 횟수
            st = new StringTokenizer(br.readLine());
            String targetString = st.nextToken();
            String copyString = st.nextToken();

            int index = 0;

            while(true){
                if(targetString.length() - index < copyString.length()){    //남아있는 검사할 문자열의 길이가 복붙 문자열의 길이보다 작다면 반복 종료
                    break;
                }

                String tempString = targetString.substring(index, copyString.length() + index); //반복시 복붙 문자열과 비교할 임시 문자열

                if(tempString.equals(copyString)){  //검사할 대상 문자열이 복붙과 같다면
                    count++;    //복붙 횟수 증가
                    index += tempString.length();   //다음번 검사할 인덱스는 복붙의 길이만큼 증가한 곳에서 시작해야 되므로 인덱스에 길이만큼 더해줌
                }else{
                    index++;    //아니라면 단순히 다음 번지수의 문자열 부터 시작하게 인덱스 1증가
                }

            }

            second = count + (targetString.length() - copyString.length()*count);   //총 문자열에서 복붙 횟수 + 복붙 문자열의 길이만큼 뺀 길이를 더하면 최종 시간이 됨

            bw.write(second + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N11008().solution();
    }
}
