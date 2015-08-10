import java.util.Scanner;

public class while01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float w = 83.5f;
		int m = 0;
		while (w > 60) {
			System.out.print("請輸入這個月減掉的體重");
			float n = scn.nextFloat();
			w = w - n;
			m++;
		}

		System.out.print("經過" + m + "個月減肥成功了");
	}

}
