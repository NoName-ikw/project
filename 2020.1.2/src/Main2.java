import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int morning = Integer.parseInt(st.nextToken());
		int night = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken())-night;
		int cli = morning-night;
		
		if(height%cli==0) {
			System.out.println(height/cli);
		}
		else {
			System.out.println((height/cli)+1);
		}
		
	}

}
