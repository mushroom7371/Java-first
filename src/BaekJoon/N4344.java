package BaekJoon;

import java.io.*;

//평균은 넘겠지
public class N4344 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());  //해당 테스트 케이스 만큼 반복하기 위해서 변수에 저장
        double avg; //평균
        int sum = 0;    //합
        int student = 0;    //평균은 넘는 학생 수
        String [] scoreArr; //학생 수와 점수가 담길 배열을 가리킬 참조변수 선언

        for(int i = 0; i < num; i++){   //테스트 케이스 수 만큼 1씩 증가하면서 반복
            scoreArr = br.readLine().split(" ");
            //입력 받은 문자를 공백을 기준으로 나누어 배열에 저장하고 참조변수 scoreArr가 가리키도록 함
            //split()메서드 내부를 확인해 보면 기준으로 나눈 데이터의 갯수를 크기로 가지는 String 타입의 배열을 생성하여 순차적으로 저장후 이를 반환한다.

            for(int j = 1; j < scoreArr.length; j++){   //첫번째 번지의 데이터는 학생 수이므로 이를 제외한 나머지 번지를 반복
                sum += Integer.parseInt(scoreArr[j]);   //문자열로 저장되어 있기에 int형으로 변환 후 더한다.
            }

            avg = (double) sum/Integer.parseInt(scoreArr[0]);   //평균을 구함. 0번지 데이터는 학생수를 의미

            for(int k = 1; k < scoreArr.length; k++){   //평균보다 높은 점수의 인원을 구하기 위한 반복
                if(Integer.parseInt(scoreArr[k]) > avg){    //평균보다 해당 번지의 데이터가 크다면
                    student++;  //학생수가 증가함
                }
            }

            String number = String.format("%.3f", (double) student/Integer.parseInt(scoreArr[0])*100);
            //String.format()을 이용하여 소수점 자리수를 지정하여 반올림한 결과를 변수에 담아둔다.
            bw.write(number + "%\n");   //버퍼에 기록하고

            //재사용을 위한 변수 초기화
            sum = 0;
            student = 0;
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
