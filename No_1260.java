import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_1260 {
	static boolean visited[];
	static int graph[][];
	static int n; // 정점
	static int m; // 간선
	static int v; // 탐색을 시작할 정점의 번호
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken()); // 정점
		m = Integer.parseInt(st.nextToken()); // 간선
		v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호
		graph = new int [n+1][n+1]; // 좌표값으로 받아주기에 n+1을 해준다
		visited = new boolean[n+1]; // 위와 같은 이유
		int a,b=0;
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken()); // a에서
			b = Integer.parseInt(st.nextToken()); // b로 가는 간선을 의미
			graph[a][b] = 1; // 각 정점에서 다른 정점으로 가는 간선이 존재한다
			graph[b][a] = 1; // 양방향 그래프라서 
		}
		// 방문한 정보를 알고 싶다
		DFS(v); // 깊이우선탐색
		 //  깊이우선탐색을 할 때 visited 값들이 바껴서 너비우선탐색을 할 때는 초기 상태로 바꿔줘야한다
		visited = new boolean[n+1];
		sb.append("\n");
		BFS(v); // 너비우선탐색
		System.out.println(sb);
	}

	private static void DFS(int v) {
		if(visited[v] == true) return; // 방문한 적 있는 정점이면 return
		visited[v] = true; // 방문한 적 없으면 방문했다고 체크
		sb.append(v+" ");
		// if문에 visited[i] == false를 넣어 줄 때와 넣어주지 않을 때 메모리 용량 차이가 있다
		for(int i=1; i<=n;i++) { // 각 정점을 기준(간선이 몇개 있는지 확인)
			if(graph[v][i] == 1 && visited[i]== false) { // v에서 i로의 간선이 있고, 한 번도 방문한 적 없는 정점일 경우
				DFS(i); // DFS 재귀, 트리의 끝까지 내려가기 위해서
			}
		}
	}
	private static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>(); // bfs 사용할 때 queue 이용
		if(visited[v] == true) return; // 방문여부 확인
		queue.offer(v); // 큐에 v 저장
		visited[v] = true; // 방문한 적 없으면 방문했다고 표시
		while(!queue.isEmpty()) { // 큐가 비어있게 되면 while문 탈출
			v = queue.poll(); // 큐의 맨 앞의 값만 반환(삭제는 하지않음)
			sb.append(v+" ");

			for(int i=1; i<=n; i++) { // 각 정점을 기준(간선이 몇개 있는지 확인)
				if(graph[v][i]==1 && visited[i] == false) { // v에서 i로의 간선이 있고, 한 번도 방문한 적 없는 정점일 경우
					queue.offer(i); // i를 큐에 저장
					visited[i] = true; // 방문하지 않았기에 방문했다고 표시
					
				}
			}
		}
	
	}
}
