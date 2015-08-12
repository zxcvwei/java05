import java.util.Scanner;

public class while04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("30箱共600斤");
		System.out.println("請輸入從每一棵樹上摘下龍眼的重量(斤)");
		int w;
		int sum = 0;
		int t = 0;
		while (sum < 600) {
			w = scn.nextInt();
			sum = sum + w;
			t++;
			System.out.println(sum+"斤重");
		}
		if (sum == 600) {
			
			System.out.println("從"+t+"棵樹上摘下的");
		} else {
			System.out.println(sum+"斤重");
			System.out.println(t);
			System.out.println("箱子爆了  龍眼壞了");
		}
	}
}
