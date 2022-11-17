package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//직각 삼각형의 두 변
public class N6322 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count = 0;

        while(true){
            count++;
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            bw.write("Triangle #" + count + "\n");
            double temp = calculate(a, b, c);
            String tempString = "";
            if(a == -1){
                tempString = "a = ";
            }else if(b == -1){
                tempString = "b = ";
            }else{
                tempString = "c = ";
            }

            if(temp == -1){
                bw.write("Impossible.\n\n");
            }else{
                bw.write(tempString + String.format("%.3f", temp) + "\n\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }

    double calculate(double a, double b, double c){
        double result = 0;

        if(c == -1){    //빗변이 -1이면 빗변의 길이를 연산해서 리턴
            c = a*a + b*b;
            result = Math.sqrt(c);
            return result;
        }

        if(a >= c || b >= c){   //빗변이 아닌 변이 빛변의 길이와 크거나 같다면
            result = -1;
            return  result;
        }

        result = Math.sqrt(c*c - (a*a + b*b - 1));  //위에서 걸리지 않은 결과는 일반 변의 길이로 c^2 = (b^2 or c^2) + 1 이므로 -1을 추가로 해줌  

        return result;
    }

    public static void main(String[] args) throws IOException{
        new N6322().solution();
    }
}
