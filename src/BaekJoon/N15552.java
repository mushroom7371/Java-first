package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//빠른 A+B
public class N15552 {
    public static void main(String[] args) throws IOException { //예외 처리 필수! try catch로 대체 가능하다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner 와 비슷한 입력, 기존의 버퍼를 이용하지 않는 입력은 누르는 즉시 전달 되나 속도가 느리다
        //버퍼를 이용하면 입력때 마다 한 문자씩 버퍼로 전송하고 버퍼가 가득차거나, 개행문자가 나타나면 버퍼의 내용을 한번에 전달한다.
        //버퍼에 담지 않고 전송하는것이 더 빨라보이나, CPU와 외부장치와의 입출력 성능 갭차이가 많이 나서 더 느리다.
        //마치 흙을 옮기는데 삽으로 퍼서 나르는 것보다 수레에 담아두었다가 한번에 나르는 것처럼 차이가 난다

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //System.out.println 과 유사한 출력, 마찬가지로 버퍼를 이용하기에 많은 양의 데이터 출력에 용이

        StringTokenizer st; //공백 단위의 데이터를 알기위해 이용
        int num = Integer.parseInt(br.readLine());  //readLine()메서드의 반환형은 String이므로 형변환이 필요하다. 라인 단위이다

        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine());    //
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); //자동 개행이 안되므로 \n을 추가한다
        }

        bw.close(); //입, 출력이 끝나면 스트림을 닫아준다. 자원을 OS로 반환하기 위함 N2884.java 파일 참고

    }
}
