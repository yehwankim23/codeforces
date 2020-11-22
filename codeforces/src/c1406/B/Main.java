package c1406.B;

// URL: https://codeforces.com/contest/1406/problem/B
// Problem: Maximum Product
// Verdict: Runtime error on pretest 2
// Time: 93 ms
// Memory: 0 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), n, input, neg = 0, pos = 0,
                mul = 0;
        StringTokenizer st;
        ArrayList<Integer> aln = new ArrayList<Integer>(),
                alo = new ArrayList<Integer>(), alp = new ArrayList<Integer>();
        int[] a;
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            aln.clear();
            alo.clear();
            alp.clear();
            
            for (int i = 0; i < n; i++) {
                input = Integer.parseInt(st.nextToken());
                
                if (input < 0) {
                    aln.add(input);
                } else if (input == 0) {
                    alo.add(input);
                } else {
                    alp.add(input);
                }
            }
            
            aln.sort(null);
            alp.sort(null);
            
            if (aln.size() >= 4) {
                if (alp.size() >= 1) {
                    mul = 1;
                    neg = 4;
                } else if (alo.size() >= 1) {
                    mul = 0;
                } else {
                    mul = -1;
                    neg = 5;
                }
            } else if (aln.size() >= 2) {
                if (alp.size() >= 3) {
                    mul = 1;
                    neg = 2;
                } else if (alo.size() >= 1) {
                    mul = 0;
                } else {
                    mul = -1;
                    neg = 5;
                }
            } else if (alp.size() >= 5) {
                mul = 2;
                neg = 0;
            } else {
                mul = 0;
            }
            
            if (mul != 0) {
                pos = Math.min(5, alp.size());
                a = new int[neg + pos];
                
                for (int i = 0; i < neg; i++) {
                    if (mul < 0) {
                        a[i] = aln.get(i);
                    } else {
                        a[i] = Math.abs(aln.get(i));
                    }
                }
                
                for (int i = 0; i < pos; i++) {
                    a[neg + i] = alp.get(alp.size() - i - 1);
                }
                
                Arrays.sort(a);
                mul = 1;
                
                for (int i = 0; i < 5; i++) {
                    mul *= a[a.length - i - 1];
                }
            }
            
            sb.append(mul).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
