import java.util.Scanner;
public class while03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入西元年");
		int y = scn.nextInt();
		while(fuc(y)==0){
			System.out.println(y+"不是閏年,請輸入西元年");
			y = scn.nextInt();
		}
		
		System.out.println(y+"是閏年");
		
	}
	
	public static int fuc(int y){
		if (y % 400 == 0) {// 是閏年
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
