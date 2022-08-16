package BaekJoon;

import java.io.*;

//N과 M(1)
public class N15649 {
    //처음엔 dfs의 개념을 모르고 도전했다가 도저히 답이 안나와서 다른 사람의 코드를 보고 이해함.
    //dfs 메서드를 static으로 선언하였기에 클래스가 메모리에 적재될 때 생성되어 사용 가능하므로
    //dfs 메서드 안에서 사용할 참조변수 또한 static으로 선언되어 존재하고 있어야 사용이 가능하다.
    static boolean [] isVisitArray; //방문여부를 저장할 논리형 배열을 참조할 변수
    static int [] numberArray;  //실제 숫자를 저장할 int형 배열을 참조할 변수
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //dfs 메서드에서 사용하므로 이젠에 푼 문제와 다르게 ststic으로 선언

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] numberInfo = br.readLine().split(" ");
        int numberN = Integer.parseInt(numberInfo[0]);
        int numberM = Integer.parseInt(numberInfo[1]);

        //위의 코드에서는 참조변수를 선언만 하였고 실제 배열을 만들지는 않았기에 문제에 맞는 크기만큼 생성하여 선언함
        isVisitArray =  new boolean[numberN];
        numberArray =  new int[numberM];
        dfs(numberN, numberM, 0);   //깊이가 0인 dfs메서드 호출

        br.close();
        bw.flush();
        bw.close(); //ststic으로 선언했기에 메인 메서드가 종료되기 전에 꼭 닫혀야 할거 같음 안그러면 메모리의 static 영역에 계속 남아 있을듯(뇌피셜임)

    }

    static void dfs(int numberN, int numberM, int depth) throws IOException {
        if(depth == numberM){   //깊이가 numberM 와 같다면
            for(int i = 0; i <  numberArray.length; i++){   //배열에 저장된 숫자를 공백으로 나눠 버퍼에 기록
                bw.write(numberArray[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = 0; i < numberN; i++){
            if(!isVisitArray[i]){   //방문하지 않은 위치라면
                isVisitArray[i] = true; //i번지의 방문 여부를 참으로 변경하고
                numberArray[depth] = i + 1; //깊이 번지에 있는 데이터를 i+1해준다. <= 배열은 0번지부터 시작하므로
                dfs(numberN, numberM, depth + 1);   //재귀호출을 실시 여기서 깊이가 1늘어나게 되고, 다시 호출되었을땐 i번지가 이미 방문 상태가 되어 있기에 중복이 걸러진다.
                isVisitArray[i] = false;    //dfs 재귀 호출이 조건을 만나서(깊이가 numberM이 될때) 버퍼에 기록만 하고 종료된다면 i번지의 방문 여부는 다시 초기값으로 설정한다.(이후에도 사용해야 되기 때문)
            }
        }
    }

}
