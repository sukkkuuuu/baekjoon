import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class No_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for (int i=M; i<=N; i++) if(isPrime(i)) System.out.println(i);
	}
	
	private static boolean isPrime(int key) { // 소수 판별 함수
		if(key==1) return false; // 1은 소수가 아니다
		for(int i=2; i<=Math.sqrt(key); i++) if(key%i == 0) return false; // key가 false이면 소수(1과 자기자신 말고 나누어지는 수가 있기 때문에)
		return true;
	}
}