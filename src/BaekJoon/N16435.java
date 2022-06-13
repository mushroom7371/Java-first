package BaekJoon;

import java.io.*;
import java.util.Arrays;

//스네이크 버드
public class N16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] inputInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();   //N1026 참고
        int snakeLength = inputInfo[1]; //최초 뱀의 길이
        int [] fruitHeightArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        for(int i = 0; i < fruitHeightArray.length; i++){   //과일 수 만큼 반복
            if(snakeLength >= fruitHeightArray[i]){ //뱀의 길이가 과일 높이 이상이라면
                snakeLength++;  //뱀의 길이 1 증가
            }else{  //아니면 반복 종료
                break;
            }
        }

        br.close();
        bw.write(snakeLength + "");
        bw.flush();
        bw.close();

    }
}
