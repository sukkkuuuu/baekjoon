import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2018 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int start = 0, end = 0, sum =0, count=0;
		// start, end 투포인터 설정, sum : 합, count : 조합 개수
		
		while(start <= N) {
			while(++end <= N) {
				sum += end;
				if(sum >= N) {
					if(sum == N) count++;
					break;
				}
			}
			while(++start <= N) {
				sum-=start;
				if(sum <= N) {
					if(sum == N) count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}