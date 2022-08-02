import java.util.Scanner;

public class 그룹단어체커_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int nCnt = 1;
			int[][] acm = new int[W][H];

			end: for (int j = 0; j < W; j++) {
				for (int k = 0; k < H; k++) {
					if (N == nCnt) {
						System.out.printf("%d%02d", k+1, j+1);
						break end;
					} else
						nCnt++;
				}
			}
		}
	}
}

//출력은 제대로 나오는데 틀렸습니다 뜸. 반례를 찾아봐야 할 것 같음