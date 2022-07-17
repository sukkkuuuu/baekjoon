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
				// 출력을 할 때, 참조한 인덱스가 공백 또는 null 문자 일 경우, 넘어가고 계속 진행 ( continue )
				if(s[j][i]==' ' || s[j][i]=='\0') continue;
				sb.append(s[j][i]);
			}
		}
		System.out.println(sb);
	}
}