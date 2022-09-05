package BaekJoon;

import java.io.*;

//재귀함수가 뭔가요?
public class N17478 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    void solution() throws IOException{
        int testCase = Integer.parseInt(br.readLine());
        int flag = -1;  //재귀의 횟수를 알리는 변수
        br.close();

        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다." + "\n");

        whatIsRecursiveFunction(flag, testCase);    //인자값으로 초기 flag 값과 testCase를 가지고 메서드를 호출

        bw.flush();
        bw.close();

    }

    void whatIsRecursiveFunction(int flag, int testCase) throws IOException{
        flag++; //호출시 flag 증가
        String temp0 = "";  //____를 담을 String 선언

        for(int i = 0; i < flag; i++){  //flag 전까지 반복하여 ____를 추가함 (1일때는 당연히 반복이 돌지 않음)
            temp0 += "____";
        }

        String temp1 = temp0 + "\"재귀함수가 뭔가요?\"" + "\n";
        String temp2 = temp0 + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." + "\n";
        String temp3 = temp0 + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지." + "\n";
        String temp4 = temp0 + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"" + "\n";
        String temp5 = temp0 + "\"재귀함수는 자기 자신을 호출하는 함수라네\"" + "\n";

        if(flag < testCase){    //testCase 전까지 위의 String을 버퍼에 기록하고 재귀호출 실시
            bw.write(temp1 + temp2 + temp3 + temp4);
            whatIsRecursiveFunction(flag, testCase);
        }else if(flag == testCase){ //testCase에 도달 했다면 답변을 버퍼에 기록후 밑으로 내려가고, 이후엔 모두 flag값이 testCase보다 크므로 재귀를 빠져나옴
            bw.write(temp1);
            bw.write(temp5);
        }

        String temp6 = temp0 + "라고 답변하였지." + "\n";
        bw.write(temp6);
    }

    public static void main(String[] args) throws IOException{
        new N17478().solution();
    }
}
