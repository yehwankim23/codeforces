package c1402.A;

// URL: https://codeforces.com/contest/1402/problem/A
// Problem: Fancy Fence
// Verdict: Partial result: 12 points
// Time: 1000 ms
// Memory: 252600 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int section = Integer.parseInt(br.readLine()), max = 0, count = 0;
        StringTokenizer heights = new StringTokenizer(br.readLine()),
                widths = new StringTokenizer(br.readLine());
        br.close();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int s = 0; s < section; s++) {
            int width = Integer.parseInt(widths.nextToken()),
                    height = Integer.parseInt(heights.nextToken());
            
            max = Math.max(max, height);
            
            for (int w = 0; w < width; w++) {
                al.add(height);
            }
        }
        
        for (int y = 1; y <= max; y++) {
            for (int x = 0; x < al.size(); x++) {
                for (int j = 0; y + j <= max; j++) {
                    for (int i = 0; x + i < al.size(); i++) {
                        if (al.get(x + i) >= y + j) {
                            count++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
