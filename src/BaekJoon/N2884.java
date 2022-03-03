package BaekJoon;

import java.util.Scanner;

//알람 시계
public class N2884 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();    //시간을 키보드로 부터 "00 00" 와 같은 문자열 형식으로 받는다

        sc.close(); //sc변수에 Scanner 객체가 담겨있으므로 가비지 컬렉션의 제외 대상이 된다.
        //System.in을 통해 OS에서 제공한 표준 입력을 계속 잡고 있게 되며, OS의 자원을 되돌리기 위해 닫아준다.

        String [] timeArr = time.split(" ");    //공백을 기준으로 시간, 분으로 나눠 배열에 저장한다.
        int h = Integer.parseInt(timeArr[0]);   //0번지는 시간
        int m = Integer.parseInt(timeArr[1]);   //1번지는 분

        if(m < 45){ //45분 일찍 알람 설정을 해야 하므로 45보다 알람 시간이 이르다면,
            if(h == 0){ //0시일때는 23시로 되돌리고
                h = 23;
            }else{  //아니라면 1시간 빠르게 설정한다.
                h--;
            }
            m = m - 45 + 60;    //시간은 60분 기준이므로, 기존 알람시간에서 45분을 제한 후 60을 더한다.
        }else{  //0시가 아니라면 시간을 고려할 이유가 없다.
            m = m - 45; //마찬가지로 45분 이상이라면 분 또한 고려할 사항이 없다.
        }

        System.out.println(h + " " + m);

    }
}
