import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2343 {
	private static int a;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int left = 0, right = 0;
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right+=arr[i]; // 임의의 최대값
			left = left < arr[i] ? arr[i] : left; // 임의의 최소값
		}
		
		while(left <= right) {
			int mid = (left+right)/2; // 임의의 중앙값
			int sum = 0; // 블루레이의 길이 확인하기 위해 사용
			int count = 0; // 블루레이 개수와 비교하려고 사용
			for(int i=0; i<N; i++) {
				if(sum+arr[i] > mid) {
					sum =0;
					count++;
				}
				sum+=arr[i];
			}
			if(sum!=0) count++; // ?
			if(count<=M) right = mid-1; //
			else left = mid+1; // 
		}
		System.out.println(left);
	}
}
