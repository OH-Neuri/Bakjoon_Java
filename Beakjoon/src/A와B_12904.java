import java.util.Scanner;

public class A와B_12904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next(); // B
		String T = sc.next(); // ABBA
		int cnt = 0;

		while (S.length() < T.length()) {
			String S1 = S + "A";

			if (S1.equals(T)) {
				cnt++;
				break;
			}

			for (int i = S1.length(); i > 0; i--) {
				//S1 = S1.charAt(i);    수정이 필요함 -> 배열로 접근하는게 좋을 거 같음
			}
			S1 += "B";
			if (S1.equals(T)) {
				cnt++;
				break;
			}
		}
		if(cnt==1)
			System.out.println("1");
		else
			System.out.println("0");

	}

}
