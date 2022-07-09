import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// K���� ����� ���� �ʿ��� ������ �ּ� ���� ���ϱ�
public class No_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()); // ���� ���� N��
		int K = Integer.parseInt(st.nextToken()); // �ݾ� K��
		
		int Money[] = new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			Money[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0; // ������ ����
		
		for(int i=N-1; i>=0; i--) {
			count += K / Money[i];
			K = K % Money[i]; // ���� �ݾ�
			if(K==0) break;
		}
		System.out.println(count);
	}
}
