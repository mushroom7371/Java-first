package BaekJoon;

import java.io.*;
import java.util.Map;

//Archivist
public class N20232 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> infoMap = Map.ofEntries(
                Map.entry("1995", "ITMO"),
                Map.entry("1996", "SPbSU"),
                Map.entry("1997", "SPbSU"),
                Map.entry("1998", "ITMO"),
                Map.entry("1999", "ITMO"),
                Map.entry("2000", "SPbSU"),
                Map.entry("2001", "ITMO"),
                Map.entry("2002", "ITMO"),
                Map.entry("2003", "ITMO"),
                Map.entry("2004", "ITMO"),
                Map.entry("2005", "ITMO"),
                Map.entry("2006", "PetrSU, ITMO"),
                Map.entry("2007", "SPbSU"),
                Map.entry("2008", "SPbSU"),
                Map.entry("2009", "ITMO"),
                Map.entry("2010", "ITMO"),
                Map.entry("2011", "ITMO"),
                Map.entry("2012", "ITMO"),
                Map.entry("2013", "SPbSU"),
                Map.entry("2014", "ITMO"),
                Map.entry("2015", "ITMO"),
                Map.entry("2016", "ITMO"),
                Map.entry("2017", "ITMO"),
                Map.entry("2018", "SPbSU"),
                Map.entry("2019", "ITMO")
        );

        String year = br.readLine();
        bw.write(infoMap.get(year));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20232().solution();
    }
}
