import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class No_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char s[][] = new char [5][15];
		
		for(int i=0; i<5; i++) {
			String ss = bf.readLine();
			for(int j=0; j<ss.length(); j++) {
				s[i][j] = ss.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				// ����� �� ��, ������ �ε����� ���� �Ǵ� null ���� �� ���, �Ѿ�� ��� ���� ( continue )
				if(s[j][i]==' ' || s[j][i]=='\0') continue;
				sb.append(s[j][i]);
			}
		}
		System.out.println(sb);
	}
}