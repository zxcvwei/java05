import java.util.Scanner;
public class while03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�褸�~");
		int y = scn.nextInt();
		while(fuc(y)==0){
			System.out.println(y+"���O�|�~,�п�J�褸�~");
			y = scn.nextInt();
		}
		
		System.out.println(y+"�O�|�~");
		
	}
	
	public static int fuc(int y){
		if (y % 400 == 0) {// �O�|�~
			return 1;
		}else if(y%100==0){
			return 0;
		}else if(y%4==0){
			return 1;
		}else{
			return 0;
		}
	}

}
