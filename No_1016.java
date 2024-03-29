import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long min = Long.parseLong(st.nextToken());
		long max = Long.valueOf(st.nextToken());
		
		int result = (int) (max - min + 1);
		int sqrt = ((int) Math.sqrt(max));
		boolean[] checks = new boolean[result]; // 薦咽 いい呪亜 焼還聖 端滴. false : 薦咽いい呪, true : 薦咽いい呪亜 焼還.
		long[] num = new long[result];
		
		for(long i = 2; i <= sqrt; i++) { 
			long squared = i * i;
			long start = min % squared == 0 ? min / squared : (min / squared) + 1; // min%squared == 0 戚檎 交戚 0左陥 滴陥. 聡, start > 0
			for(long j = start; j * squared <= max; j ++) {   // 交聖 1梢 装亜獣鉄( j亜 交 ), 
				checks[(int) ( (j * squared) - min)] = true; // 壕伸税 舛溌廃 是帖研 達生形 -min聖 背層陥
				// checks研 true稽 背爽澗 戚政澗 戚耕 蟹紳 薦咽 いい呪研 count馬走 省奄 是背辞
			}	
		}
		// 薦咽いい呪 鯵呪 counting
		int count = 0;
		for(int i = 0; i < result; i++) {
			if(!checks[i]) { // checks[i]税 葵戚 false昔 依級戚 true稽 郊会(薦咽呪 いい 鯵呪 姥敗)
				count++;
			}
		}
		System.out.println(count);
	}
}

