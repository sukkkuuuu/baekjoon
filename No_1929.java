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
	
	private static boolean isPrime(int key) { // �Ҽ� �Ǻ� �Լ�
		if(key==1) return false; // 1�� �Ҽ��� �ƴϴ�
		for(int i=2; i<=Math.sqrt(key); i++) if(key%i == 0) return false; // key�� false�̸� �Ҽ�(1�� �ڱ��ڽ� ���� ���������� ���� �ֱ� ������)
		return true;
	}
}