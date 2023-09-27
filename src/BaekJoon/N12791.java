package BaekJoon;

import java.io.*;

//Starman
public class N12791 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] album = {
            "1967 DavidBowie",
            "1969 SpaceOddity",
            "1970 TheManWhoSoldTheWorld",
            "1971 HunkyDory",
            "1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars",
            "1973 AladdinSane",
            "1973 PinUps",
            "1974 DiamondDogs",
            "1975 YoungAmericans",
            "1976 StationToStation",
            "1977 Low",
            "1977 Heroes",
            "1979 Lodger",
            "1980 ScaryMonstersAndSuperCreeps",
            "1983 LetsDance",
            "1984 Tonight",
            "1987 NeverLetMeDown",
            "1993 BlackTieWhiteNoise",
            "1995 1.Outside",
            "1997 Earthling",
            "1999 Hours",
            "2002 Heathen",
            "2003 Reality",
            "2013 TheNextDay",
            "2016 BlackStar"
        };
        int numberOfQueries = Integer.parseInt(br.readLine());

        while (numberOfQueries --> 0) {
            String[] query = br.readLine().split(" ");
            int startYear = Integer.parseInt(query[0]);
            int endYear = Integer.parseInt(query[1]);
            int count = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < album.length; i++) {
                int year = Integer.parseInt(album[i].split(" ")[0]);
                if (year >= startYear && year <= endYear) {
                    count++;
                    sb.append(album[i]).append("\n");
                }
            }

            bw.write(String.valueOf(count) + "\n");
            bw.write(sb.toString());
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12791().solution();
    }
}
