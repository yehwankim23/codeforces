package c1409.A;

// URL: https://codeforces.com/contest/1409/problem/A
// Problem: Yet Another Two Integers Problem
// Verdict: Accepted
// Time: 108 ms
// Memory: 0 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            sb.append((Math.abs(Integer.parseInt(st.nextToken())
                    - Integer.parseInt(st.nextToken())) + 9) / 10 + "\n");
        }
        
        br.close();
        System.out.println(sb);
    }
}
