import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.valueOf(st.nextToken());
		
		int result = (int) (max - min + 1);
		int sqrt = ((int) Math.sqrt(max));
		boolean[] checks = new boolean[result]; // 제곱 ㄴㄴ수가 아님을 체크. false : 제곱ㄴㄴ수, true : 제곱ㄴㄴ수가 아님.
		long[] num = new long[result];
		
		for(long i = 2; i <= sqrt; i++) { 
			long squared = i * i;
			long start = min % squared == 0 ? min / squared : (min / squared) + 1; // min%squared == 0 이면 몫이 0보다 크다. 즉, start > 0
			for(long j = start; j * squared <= max; j ++) {   // 몫을 1씩 증가시킴( j가 몫 ), 
				checks[(int) ( (j * squared) - min)] = true; // 배열의 정확한 위치를 찾으려 -min을 해준다
				// checks를 true로 해주는 이유는 이미 나온 제곱 ㄴㄴ수를 count하지 않기 위해서
			}	
		}
		// 제곱ㄴㄴ수 개수 counting
		int count = 0;
		for(int i = 0; i < result; i++) {
			if(!checks[i]) { // checks[i]의 값이 false인 것들이 true로 바뀜(제곱수 ㄴㄴ 개수 구함)
				count++;
			}
		}
		System.out.println(count);
	}
}

