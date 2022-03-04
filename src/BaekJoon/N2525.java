package BaekJoon;

import java.util.Scanner;

//오븐 시계
public class N2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //참조변수 sc 가 Scanner 객체를 가리키도록 한다.

        String str = sc.nextLine(); //현재 시간을 "00 00" 형식의 문자열로 받음
        int cookTime = sc.nextInt();    //조리 시간은 int 타입의 분으로 받음

        sc.close(); //참조변수 sc가 Scanner 객체를 가리키고 있는 상태면 가비지 컬렉터의 제외 대상이됨
        //System.in을 통해 OS에서 제공한 표준 입력을 계속 잡고 있는게 되어 OS의 자원을 되돌리기 위해 닫아준다.

        String [] strArr = str.split(" ");  //공백을 기준으로 시간과 분을 가른다.
        int hour = Integer.parseInt(strArr[0]); //0번지에는 시간이
        int minute = Integer.parseInt(strArr[1]);   //1번지에는 분이 담긴다.
        int cookH = cookTime/60;    //주어진 분에 대한 시간을 구하고
        int cookM = cookTime%60;    //나머지 연산자로 분을 구한다

        if(minute + cookM >= 60){   //조리에 걸리는 분과 현재 시간의 분의 합이 60 이상이면
            cookH++;    //조리시간을 1 증가 시킨다
            minute = minute + cookM - 60;   //서로의 합에서 60분을 빼면 예상 분이 된다.
            if(hour + cookH >= 24){ //조리 시간과 현재 시간의 합이 24시를 넘는다면
                hour = hour + cookH - 24;   //서로의 합에서 24를 빼고 예상 시간이 된다.
            }else {
                hour = hour + cookH;    //조건이 아니라면 더한 시간이 예상시간이 된다.
            }
        }else{
            minute = minute + cookM;    //현재, 조리게 걸리는 분이 60 미만이라면 더하여 예상 분을 구한다
            if(hour + cookH >= 24){ //위와 마찬가지
                hour = hour + cookH - 24;
            }else {
                hour = hour + cookH;
            }
        }

        System.out.println(hour + " " + minute);

    }
}
