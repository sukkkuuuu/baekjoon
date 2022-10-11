import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1966 {
	static int t; // �׽�Ʈ ���̽� ��
	static int n; // ������ ����
	static int m; // �ñ��� ������ �ʱ� ��ġ
	static Queue<Integer> queue; // ������ �߿䵵
	static Queue<Integer> indexQueue; // ������ �ε���
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	t = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < t; i++) {    		
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		n = Integer.parseInt(st.nextToken());
    		m = Integer.parseInt(st.nextToken());

    		queue = new LinkedList<>();
    		indexQueue = new LinkedList<>();
    		
    		st = new StringTokenizer(br.readLine());
    		// �߿䵵, �ε��� �Է�
    		for(int j = 0; j < n; j++) {
    			queue.offer(Integer.parseInt(st.nextToken()));
    			indexQueue.offer(j);
    		}
    		
    		solve();
    	}
    }
    
    public static void solve() {
    	int count = 0; // ��� ° �μ�����
    	
    	while (!queue.isEmpty()) {
    		int max = Collections.max(queue); // ���� �ֿ켱 ����
    		int cur = queue.poll(); // ���� ����
    		int curIndex = indexQueue.poll(); // ���� �ε���
    		
    		// �μ� ������ ��
    		if(cur == max) {
    			// ã�� ������ �μ��ߴٸ� ��� ° �μ����� ���, break
    			count++; // �μ��Ҷ����� �� ����
    			if(curIndex == m) {
    				
    				System.out.println(count);
    				break;
    			}
    		}
    		// �μ� �Ұ����ϸ� �ٽ� �� �ڿ� �־���
    		else {
    			queue.offer(cur);
    			indexQueue.offer(curIndex);
    		}
    	}
    }
}
