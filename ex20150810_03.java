import java.util.Scanner;
public class ex20150810_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J����ܪ��ϧ� Ex�T���Ωε٧�");
		String  str = scn.next();
		System.out.println("�п�J��");
		if(str.equals("�T����")){
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
		if(str.equals("�٧�")){
			int n = scn.nextInt();
			int V1 = (int)Math.ceil(n/2);
			int V2 = n - V1;
			for(int i = 1;i<=V1;i++){
				for(int j = 1;j<=V1-i+1;j++){
					System.out.print(' ');
				}
				for(int k = 1;k<=2*i-1;k++){
					System.out.print('*');
				}
				System.out.println();
			}
			for(int i = 1;i<=V2;i++){
				for(int j = 1;j<=i-1;j++){
					System.out.print(' ');
				}
				for(int k = 1;k<=2*(V2-i)+1;k++){
					System.out.print('*');
				}
				System.out.println();
			}
		}
		
		
		
	}

}
