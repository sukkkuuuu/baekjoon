import java.util.LinkedList;
import java.util.Scanner;

public class No10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int r []= new int[s.length()]; // ������ ���� ��ġ�� �迭
		int pipe_all = 0; // �и��� �� ������ ����
		LinkedList <Integer> cha = new LinkedList<>();
		
		for(int i=0; i<s.length(); i++) {
			int razer = 0; // ������ ����
			if(s.charAt(i) == '(') 	{
				// �������� ������ ���
				if(s.charAt(i+1) == ')') r[i] = 1; // ������'()'�� ��������� �κ�, �긦 �����
				// �������� ���� ���
				else if(s.charAt(i+1) == '(') cha.add(i); // ������ ��������� �κ�
				
			}
			else if(s.charAt(i) == ')') {
				if(s.charAt(i-1) == ')') { // �������� ���� ���
					// �������� �������� ���� ���� �������� ������ �и��Ǵ� ������ ������ �� �� �ִ� 
					int k = cha.removeLast(); // ��ũ�帮��Ʈ cha�� ������ value�� ��ȯ�ϰ� ����
					for(int j=k; j<i; j++) if(r[j]>0) razer++;	
				}
			}
			if(razer>0) {
				int di = razer+1; // �и��� �������� ���� = �������� ���� +1���̴�
				pipe_all += di; // �� �������� ����
			}
		}
		System.out.println(pipe_all);
	}
}
