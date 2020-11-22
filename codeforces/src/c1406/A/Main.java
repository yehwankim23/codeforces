package c1406.A;

// URL: https://codeforces.com/contest/1406/problem/A
// Problem: Subset Mex
// Verdict: Wrong answer on pretest 2
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
        int t = Integer.parseInt(br.readLine()), n, mex;
        int[] a;
        boolean b;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            a = new int[101];
            mex = 0;
            b = true;
            
            while (n-- > 0) {
                a[Integer.parseInt(st.nextToken())]++;
            }
            
            for (int i = 0; i < a.length; i++) {
                if (a[0] == 1 && a[i] == 0) {
                    mex = i;
                    break;
                } else if (a[0] > 1) {
                    if (a[i] == 1 && b) {
                        mex += i;
                        b = false;
                    } else if (a[i] == 0) {
                        mex += i;
                        break;
                    }
                }
            }
            
            sb.append(mex).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
