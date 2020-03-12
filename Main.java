import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		int[][] num = new int[101][10];
		num[0][0]=0;
		for(int i=1;i<10;i++) {
			num[1][i]=1;
		}
		for(int i=2;i<len+1;i++) {
			for(int j=0;j<10;j++) {
				if(j==0) {
					num[i][j]=num[i-1][1];
				}
				else if(j==9) {
					num[i][j]=num[i-1][8];
				}
				else {
					num[i][j]=(num[i-1][j-1]+num[i-1][j+1])%1000000000;				}
			}
		}
		int answer=0;
		for(int i=0;i<10;i++) {
			answer=(answer+num[len][i])%1000000000;
		}
		System.out.println(answer);
		
		
	}

}
