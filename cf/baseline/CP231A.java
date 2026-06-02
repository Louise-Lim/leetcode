package cf.baseline;

import java.io.*;
import java.util.*;
 
public class CP231A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer st;
 
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null)
                return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }
 
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
 
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
 
    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int result = 0;
 
        for (int i = 0; i < n; i++) {
            int count = 0;
 
            for (int j = 0; j < 3; j++) {
                if (nextInt() == 1) {
                    count++;
                }
            }
 
            if (count >= 2) {
                result++;
            }
        }
 
        out.println(result);
        out.flush();
    }
}
