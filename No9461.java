import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_9461 {
	static long arr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long t = Integer.parseInt(bf.readLine());
		arr = new long[101];
		arr[0] = arr[1] = arr[2] = 1;
		for(int i=0; i<t;i++) {
			int n = Integer.parseInt(bf.readLine());
			for(int j=3; j<n;j++) arr[j] = arr[j-2]+arr[j-3];
			System.out.println(arr[n-1]);
		}
	}
}
