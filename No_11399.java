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
		Arrays.sort(arr); // �����ϴµ� �ɸ��� �ð��� ª�� ������� ���� �ϸ� �ڿ� ����� ª�� ��ٸ���
		int sum =0, add=0; // SUM�� ��� ����� �����ϴµ� �ɸ��� �ð�, ADD�� �� ����� �����ϴµ� �ɸ��� �ð� 
		for(int i=0;i<N;i++) {
			add+=arr[i];
			sum+=add;
		}
		
		System.out.println(sum);
	}
}
