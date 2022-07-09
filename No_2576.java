import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2576 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int sum = 0;
		int k = Integer.MAX_VALUE;
		for(int i=0; i<7; i++) {
			st = new StringTokenizer(bf.readLine());
			int p = Integer.parseInt(st.nextToken()); 
			if(p%2!=0) {
				sum += p;
				k = k>p? p : k;
			}
		}
		if (k==Integer.MAX_VALUE) System.out.println("-1");
		else System.out.println(sum+"\n"+k);
	}
}
