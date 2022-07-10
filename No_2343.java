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
			right+=arr[i]; // ������ �ִ밪
			left = left < arr[i] ? arr[i] : left; // ������ �ּҰ�
		}
		
		while(left <= right) {
			int mid = (left+right)/2; // ������ �߾Ӱ�
			int sum = 0; // ��緹���� ���� Ȯ���ϱ� ���� ���
			int count = 0; // ��緹�� ������ ���Ϸ��� ���
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
