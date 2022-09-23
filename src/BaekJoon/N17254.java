package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//키보드 이벤트
public class N17254 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfKeyboard = Integer.parseInt(st.nextToken());    //키보드 키보드 종류
        int numberOfTyping = Integer.parseInt(st.nextToken());  //누를 횟수
        String[][] inputArray = new String[numberOfTyping][numberOfKeyboard];

        for(int i = 0; i < numberOfTyping; i++){    //1차원 배열이 키보드 종류, 누를 시간, 누를 문자의 데이터를 가진 배열을 가리키도록 함
            inputArray[i] = br.readLine().split(" ");
        }

        Arrays.sort(inputArray, (o1, o2) -> {
            if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])){ //누를 시간이 같다면
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));   //키보드 종류가 빠른것 부터 정렬
            }

            return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));   //누른 시간이 빠른 것 부터 정렬
        });

        for (String[] strings : inputArray) {
            bw.write(strings[2]);
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N17254().solution();
    }
}
