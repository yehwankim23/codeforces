package c1409.C;

// URL: https://codeforces.com/contest/1409/problem/C
// Problem: Yet Another Array Restoration
// Verdict: Wrong answer on test 1
// Time: 93 ms
// Memory: 0 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), n, x, y, d;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            d = y - x;
            
            for (int i = 2; i < n; i++) {
                if (y - d / i * (n - 1) > 0 && d % i == 0) {
                    d /= i;
                }
            }
            
            x = y - d * (n - 1);
            
            for (int i = 0; i < n; i++) {
                sb.append(x + " ");
                x += d;
            }
            
            sb.append("\n");
        }
        
        br.close();
        System.out.println(sb);
    }
}
