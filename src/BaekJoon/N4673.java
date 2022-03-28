package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//셀프 넘버
public class N4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean [] selfNumArr = new boolean[10001];
        //0번지 부터가 아닌 1번지 부터 1~10000의 숫자에 대한 셀프 넘버 판단을 할것이므로 크기를 10001로 설정

        for(int i = 1; i <= 10000; i++){
            int n = generator(i); //generator() 메서드를 호출하여 생성자를 반환 받아 변수에 저장하고,

            if(n <= 10000){ //범위 이내의 숫자라면
                selfNumArr[n] = true;   //위에서 선언한 논리 배열의 n번지의 값을 true(해당 숫자가 생성자라는 의미)로 바꿔준다
            }
        }

        for(int i = 1; i <= 10000; i++){
            if(selfNumArr[i] == false){ //배열에 저장된 번지의 숫자의 데이터가 false(생성자가 아니다 즉, 셀프 넘버를 의미)라면
                bw.write(i + "\n"); //버퍼에 기록
            }
        }

        bw.flush();
        bw.close();

    }

    public static int generator(int number){  //메서드를 따로 만들어 사용 하기위해 클래스가 메모리에 적재될 때 생성되는 static으로 선언
        int sum = number;
        //셀프 넘버란 자기 '자신과 각 자리수를 더하는 수'(뒷 숫자의 생성자 라고 한다)가 없는 숫자이다
        //셀프 넘버를 판단할 변수를 초기화 하되, 인자로 받은 숫자로 설정하여 따로 자기 자신을 더하는 로직을 제외 했다.

        while(number > 0){  //반복 시행이 언제 끝날지 모르므로 whlie문을 사용
            sum += number % 10; //10으로 나눈 나머지를 더하여 마지막 자리 숫자를 구하고,
            number /= 10;       //number를 10으로 나눠 그 다음 자리의 숫자를 구하도록 세팅
        }

        return sum; //생성자를 반환
    }

}
