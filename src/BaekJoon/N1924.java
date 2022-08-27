package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//2007년
public class N1924 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int daySum = 30*(month - 1) + day;  //한달의 일자를 30일로 가정하고, 해당 달은 포함되지 않으니 -1로 곱해줌

        String [] dayOfTheWeekArray = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for(int i = 1; i < month; i++){ //1월부터 month 전 까지의 일자를 조율할 반복문
            if(i == 2){ //2월은 28일이니 위에서 설정한 30일에서 -2일이 되어야함
                daySum -= 2;
            }else if(i == 4 || i == 6 || i == 9 || i == 11){    //4,6,9,11월은 30일까지 있음
            }else{  //나머지는 31일이라 +1일
                daySum++;
            }
        }

        br.close();
        bw.write(dayOfTheWeekArray[daySum % 7]);    //총 일수를 7로 나눈 나머지에 해당하는 번지수가 요일이 된다.
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N1924().solution();
    }
}
