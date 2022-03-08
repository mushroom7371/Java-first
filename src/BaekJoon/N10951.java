package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//A+B-4(EOF)
public class N10951 {
    public static void main(String[] args) throws IOException {
        //주어진 문제는 입력이 끝나는 지점을 알수없다. EOF(End Of File)처리를 해야된다. BufferedReader,Writer는 N15552.java 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       //1)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     //2)
        //buffer는 일종의 데이터를 담아 둘 수 있는 큐이다. 문자열 데이터로 이동하며, Stream 방식(단방향, blocking)으로 작동한다
        //1)입력값을 한번에 모아 전송한다. InputStream을 사용하며 시스템에서 입력 받은 값(System.in)의 통로가 된다.
        //  BufferedReader의 메모리 영역을 할당(인스턴스화)하고 통로를 InputStreamReader로 정해준다.
        //  사용자가 시스템에서 값을 받는 다는 것을 지정한다(System.in)
        //2)출력값을 한번에 모아 전송한다. OutputSteam을 사용하며 시스템에서 출력 할 값(System.out)의 통로가 된다.
        //  출력은 3단계로 이루어 진다. buffer에 기록하기 -> 출력하기 -> buffer 닫기

        StringTokenizer st;
        String str = "";
        int a = 0;
        int b = 0;

        while((str = br.readLine()) != null){
            //.readLine()을 통해 사용자로 부터 입력값을 받아 참조변수 str이 가리키도록 하였고, 내용이 null이 아닐때 까지 반복한다.
            st = new StringTokenizer(str);

            if(st.hasMoreTokens()){ //토큰이 있다면
                b = Integer.parseInt(st.nextToken());   //String 타입이므로 이를 Int 타입으로 형변환 하여 변수에 저장한다.
                a = Integer.parseInt(st.nextToken());
                bw.write(a + b + "\n"); //출력을 위한 내용을 write()메서드를 통하여 저장한다
            }else{
                break;
            }
        }

        br.close();
        bw.flush(); //기록한 값을 한번에 출력한다
        bw.close(); //메모리 누수를 막기위해 버퍼를 닫아준다

    }
}
