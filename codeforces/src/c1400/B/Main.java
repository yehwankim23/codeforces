package c1400.B;

// URL: https://codeforces.com/contest/1400/problem/B
// Problem: RPG Protagonist
// Verdict: Wrong answer on test 2
// Time: 93 ms
// Memory: 0 KB

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int i, t = Integer.parseInt(br.readLine()), p, f, cntS, cntW, s, w,
                count, max, j, k, total, n, m;
        StringTokenizer st;
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            f = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            cntS = Integer.parseInt(st.nextToken());
            cntW = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            
            if (f > p) {
                count = p;
                p = f;
                f = count;
            }
            
            count = 0;
            max = 0;
            n = 0;
            m = 0;
            
            for (j = 0; j <= cntS; j++) {
                for (k = 0; k <= cntW; k++) {
                    total = s * j + w * k;
                    
                    if (total <= p && j + k > max) {
                        max = j + k;
                        n = j;
                        m = k;
                    }
                }
            }
            
            count += n + m;
            cntS -= n;
            cntW -= m;
            
            max = 0;
            n = 0;
            m = 0;
            
            for (j = 0; j <= cntS; j++) {
                for (k = 0; k <= cntW; k++) {
                    total = s * j + w * k;
                    
                    if (total <= f && j + k > max) {
                        max = j + k;
                        n = j;
                        m = k;
                    }
                }
            }
            
            count += n + m;
            
            bw.write(count + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
