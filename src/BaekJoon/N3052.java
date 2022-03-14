package BaekJoon;

import java.io.*;
import java.util.Arrays;

//나머지
public class N3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //buffer 내용은 이전 커밋 내용 참고

        int [] arr = new int[10];   //문제에서 주어지는 수가 10개 이므로 크기 10인 배열 생성

        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
            //해당 주소에 데이터를 입력받은 숫자를 42로 나눈 나머지로 저장한다. (readLine()은 String으로 반환하므로 형변환)
        }

        Arrays.sort(arr);   //중복 숫자를 고려사항에서 제외하기 위해 정렬

        int count = 1;  //첫 카운팅은 숫자가 들어있으므로 1로 고정

        for(int i = 1; i < 10; i++){
            if(arr[i-1] != arr[i]){ //이전 숫자(나머지)가 현재 숫자와 다르다면 카운트를 1 늘려준다.
                count++;
            }
        }

        bw.write(count + "");   //write()메서드에 int형을 그대로 사용하면 글자가 깨지므로 문자열로 변경해 준다.
        bw.flush();
        bw.close();
        br.close();

    }
}
