import java.util.Scanner;

public class while04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("30�c�@600��");
		System.out.println("�п�J�q�C�@�ʾ�W�K�U�s�������q(��)");
		int w;
		int sum = 0;
		int t = 0;
		while (sum < 600) {
			w = scn.nextInt();
			sum = sum + w;
			t++;
			System.out.println(sum+"�筫");
		}
		if (sum == 600) {
			
			System.out.println("�q"+t+"�ʾ�W�K�U��");
		} else {
			System.out.println(sum+"�筫");
			System.out.println(t);
			System.out.println("�c�l�z�F  �s���a�F");
		}
	}
}
