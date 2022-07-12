import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_1260 {
	static boolean visited[];
	static int graph[][];
	static int n; // ����
	static int m; // ����
	static int v; // Ž���� ������ ������ ��ȣ
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken()); // ����
		m = Integer.parseInt(st.nextToken()); // ����
		v = Integer.parseInt(st.nextToken()); // Ž���� ������ ������ ��ȣ
		graph = new int [n+1][n+1]; // ��ǥ������ �޾��ֱ⿡ n+1�� ���ش�
		visited = new boolean[n+1]; // ���� ���� ����
		int a,b=0;
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken()); // a����
			b = Integer.parseInt(st.nextToken()); // b�� ���� ������ �ǹ�
			graph[a][b] = 1; // �� �������� �ٸ� �������� ���� ������ �����Ѵ�
			graph[b][a] = 1; // ����� �׷����� 
		}
		// �湮�� ������ �˰� �ʹ�
		DFS(v); // ���̿켱Ž��
		 //  ���̿켱Ž���� �� �� visited ������ �ٲ��� �ʺ�켱Ž���� �� ���� �ʱ� ���·� �ٲ�����Ѵ�
		visited = new boolean[n+1];
		sb.append("\n");
		BFS(v); // �ʺ�켱Ž��
		System.out.println(sb);
	}

	private static void DFS(int v) {
		if(visited[v] == true) return; // �湮�� �� �ִ� �����̸� return
		visited[v] = true; // �湮�� �� ������ �湮�ߴٰ� üũ
		sb.append(v+" ");
		// if���� visited[i] == false�� �־� �� ���� �־����� ���� �� �޸� �뷮 ���̰� �ִ�
		for(int i=1; i<=n;i++) { // �� ������ ����(������ � �ִ��� Ȯ��)
			if(graph[v][i] == 1 && visited[i]== false) { // v���� i���� ������ �ְ�, �� ���� �湮�� �� ���� ������ ���
				DFS(i); // DFS ���, Ʈ���� ������ �������� ���ؼ�
			}
		}
	}
	private static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>(); // bfs ����� �� queue �̿�
		if(visited[v] == true) return; // �湮���� Ȯ��
		queue.offer(v); // ť�� v ����
		visited[v] = true; // �湮�� �� ������ �湮�ߴٰ� ǥ��
		while(!queue.isEmpty()) { // ť�� ����ְ� �Ǹ� while�� Ż��
			v = queue.poll(); // ť�� �� ���� ���� ��ȯ(������ ��������)
			sb.append(v+" ");

			for(int i=1; i<=n; i++) { // �� ������ ����(������ � �ִ��� Ȯ��)
				if(graph[v][i]==1 && visited[i] == false) { // v���� i���� ������ �ְ�, �� ���� �湮�� �� ���� ������ ���
					queue.offer(i); // i�� ť�� ����
					visited[i] = true; // �湮���� �ʾұ⿡ �湮�ߴٰ� ǥ��
					
				}
			}
		}
	
	}
}
