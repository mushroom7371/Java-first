package BaekJoon;

import java.io.*;

//Body Mass Index
public class N6825 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            bw.write("Underweight");
        } else if (bmi < 25) {
            bw.write("Normal weight");
        } else {
            bw.write("Overweight");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6825().solution();
    }
}
