package c1409.B;

// URL: https://codeforces.com/contest/1409/problem/B
// Problem: Minimum Product
// Verdict: Wrong answer on test 2
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
        int t = Integer.parseInt(br.readLine()), a, b, x, y, n;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            
            if (a - Math.min(a - x, n) < b - Math.min(b - y, n)) {
                int temp = a;
                a = b;
                b = temp;
            }
            a -= Math.min(a - x, n - Math.min(b - y, n));
            b -= Math.min(b - y, n);
            
            sb.append((long) a * b + "\n");
        }
        
        br.close();
        System.out.println(sb);
    }
}
