import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class No_11660{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); // N, M ����
		StringBuilder sb = new StringBuilder(); // ���ڿ��� �߰��ϰų� ������ �� ����
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int arr [][] = new int[N+1][N+1];
		
		// ����� ���� ���� ���Ѵ�
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=1; j<=N; j++) {
				arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
				// j�� 1�� ���� arr[i][j-1] ���� 0�̶� 
				// arr[i][j] = Integer.parseInt(st.nextToken()) �ȴ�  
			}
		}
		for(int i=0; i<=N; i++) {
			for (int j=0; j<=N; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for(int i=1; i<=M; i++) {
			int sum =0;
			st = new StringTokenizer(bf.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int j=x1; j<=x2; j++) {
				sum = sum + (arr[j][y2] - arr[j][y1-1]); 
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}
}
