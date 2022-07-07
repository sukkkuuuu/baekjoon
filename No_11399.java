import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr [] = new int[N];
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
				arr[i] =  Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); // 인출하는데 걸리는 시간이 짧은 사람들이 먼저 하면 뒤에 사람은 짧게 기다린다
		int sum =0, add=0; // SUM은 모든 사람이 인출하는데 걸리는 시간, ADD는 한 사람이 인출하는데 걸리는 시간 
		for(int i=0;i<N;i++) {
			add+=arr[i];
			sum+=add;
		}
		
		System.out.println(sum);
	}
}
