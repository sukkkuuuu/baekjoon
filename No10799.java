import java.util.LinkedList;
import java.util.Scanner;

public class No10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int r []= new int[s.length()]; // 레이저 시작 위치의 배열
		int pipe_all = 0; // 분리된 총 파이프 개수
		LinkedList <Integer> cha = new LinkedList<>();
		
		for(int i=0; i<s.length(); i++) {
			int razer = 0; // 레이저 개수
			if(s.charAt(i) == '(') 	{
				// 레이저가 생성될 경우
				if(s.charAt(i+1) == ')') r[i] = 1; // 레이저'()'가 만들어지는 부분, 얘를 써야함
				// 파이프가 열릴 경우
				else if(s.charAt(i+1) == '(') cha.add(i); // 파이프 만들어지는 부분
				
			}
			else if(s.charAt(i) == ')') {
				if(s.charAt(i-1) == ')') { // 파이프가 닫힐 경우
					// 파이프가 여닫히는 범위 내에 레이저의 개수로 분리되는 파이프 개수를 알 수 있다 
					int k = cha.removeLast(); // 링크드리스트 cha의 마지막 value를 반환하고 삭제
					for(int j=k; j<i; j++) if(r[j]>0) razer++;	
				}
			}
			if(razer>0) {
				int di = razer+1; // 분리된 파이프의 개수 = 레이저의 개수 +1개이다
				pipe_all += di; // 총 파이프의 개수
			}
		}
		System.out.println(pipe_all);
	}
}
