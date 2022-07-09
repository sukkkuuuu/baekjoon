import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// K원을 만들기 위해 필요한 동전의 최소 개수 구하기
public class No_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()); // 동전 종류 N개
		int K = Integer.parseInt(st.nextToken()); // 금액 K원
		
		int Money[] = new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			Money[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0; // 동전의 개수
		
		for(int i=N-1; i>=0; i--) {
			count += K / Money[i];
			K = K % Money[i]; // 남은 금액
			if(K==0) break;
		}
		System.out.println(count);
	}
}
