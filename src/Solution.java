import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Solution {
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			long A = Integer.parseInt(st.nextToken());
			long B = Integer.parseInt(st.nextToken());
			
			if (A == B) {
				bw.write("#" + test_case + " 1\n");
			} else if (A > B || N == 1) {
				bw.write("#" + test_case + " 0\n");
			} else if (N == 2) {
				bw.write("#" + test_case + " 2\n");
			} else {
				long count = (N - 2) * (B - A) + 1;
				bw.write("#" + test_case + " " + count + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}