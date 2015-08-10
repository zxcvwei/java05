import java.util.Scanner;
public class ex20150810_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn");
		int n = scn.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				
				System.out.print(' ');
			}
			for(int k =1;k<=2*i-1;k++){
				
				System.out.print('*');
				
			}
			System.out.println();
		}
	}

}
