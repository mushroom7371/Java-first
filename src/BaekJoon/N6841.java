package BaekJoon;

import java.io.*;

//I Speak TXTMSG
public class N6841 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("TTYL")) {
                bw.write("talk to you later");
                break;
            }

            switch (input) {
                case "CU":
                    bw.write("see you\n");
                    break;
                case ":-)":
                    bw.write("I’m happy\n");
                    break;
                case ":-(":
                    bw.write("I’m unhappy\n");
                    break;
                case ";-)":
                    bw.write("wink\n");
                    break;
                case ":-P":
                    bw.write("stick out my tongue\n");
                    break;
                case "(~.~)":
                    bw.write("sleepy\n");
                    break;
                case "TA":
                    bw.write("totally awesome\n");
                    break;
                case "CCC":
                    bw.write("Canadian Computing Competition\n");
                    break;
                case "CUZ":
                    bw.write("because\n");
                    break;
                case "TY":
                    bw.write("thank-you\n");
                    break;
                case "YW":
                    bw.write("you’re welcome\n");
                    break;
                default:
                    bw.write(input + "\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6841().solution();
    }
}
