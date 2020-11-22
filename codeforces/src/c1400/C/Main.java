package c1400.C;

// URL: https://codeforces.com/contest/1400/problem/C
// Problem: Binary String Reconstruction
// Verdict: Wrong answer on test 1
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
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        int i, t = Integer.parseInt(br.readLine()), x, j;
        String s;
        StringBuilder sb;
        boolean pass;
        
        for (i = 0; i < t; i++) {
            s = br.readLine();
            sb = new StringBuilder(s.replaceAll("1", "0"));
            x = Integer.parseInt(br.readLine());
            pass = true;
            
            for (j = 0; j < s.length() && pass; j++) {
                if (s.charAt(j) == '1') {
                    pass = false;
                    
                    if (j + 1 > x) {
                        sb.setCharAt(j - x, '1');
                        pass = true;
                    }
                    if (j + x + 1 <= s.length()) {
                        sb.setCharAt(j + x, '1');
                        pass = true;
                    }
                }
            }
            
            if (!pass) {
                bw.write("-1\n");
            } else {
                bw.write(sb + "\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
