import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		int[] li = new int[testcase*testcase];
		int[] li2 = new int[testcase*testcase];
		int[] a = new int[testcase+1];
		int[] b = new int[testcase+1];
		int[] c = new int[testcase+1];
		int[] d = new int[testcase+1];

		for(int i=1;i<=testcase;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i]=Integer.parseInt(st.nextToken());
			b[i]=Integer.parseInt(st.nextToken());
			c[i]=Integer.parseInt(st.nextToken());
			d[i]=Integer.parseInt(st.nextToken());
		}
		int cou=0;
		for(int i=1;i<=testcase;i++) {
			for(int j=1;j<=testcase;j++) {
				li[cou]=((a[i]+b[j]));
				li2[cou++]=((c[i]+d[j]));
			}
		}
		
		Arrays.sort(li);
		Arrays.sort(li2);
		
		int min=0,max=testcase*testcase-1;
		long answer=0;
		int pos1,pos2;
		long cou1,cou2;
		
		while(min<testcase*testcase&&max>=0) {
			if(li[min]+li2[max]<0) {
				min++;
			}
			else if(li[min]+li2[max]==0) {
				cou1=0;
				cou2=0;
				pos1=li[min];
				pos2=li2[max];
				for(;min<testcase*testcase;min++) {
					if(li[min]==pos1) {
						cou1++;
					}
					else {
						break;
					}
				}
				for(;max>=0;max--) {
					if(li2[max]==pos2) {
						cou2++;
					}
					else {
						break;
					}
				}
				answer+=cou1*cou2;			
			}
			else {
				max--;
			}
		}
		System.out.println(answer);
	}

}
