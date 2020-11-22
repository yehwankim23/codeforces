package c1400.A;

// URL: https://codeforces.com/contest/1400/problem/A
// Problem: String Similarity
// Verdict: Accepted
// Time: 93 ms
// Memory: 0 KB

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t, i, j;
        String s;
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        
        t = Integer.parseInt(br.readLine());
        
        for (i = 0; i < t; i++) {
            br.readLine();
            s = br.readLine();
            sb.setLength(0);
            
            for (j = 0; j < s.length(); j += 2) {
                sb.append(s.charAt(j));
            }
            
            bw.write(sb + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
