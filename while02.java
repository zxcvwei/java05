import java.util.Scanner;
public class while02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = 1;
		float v = 20000;
		float h = 5000000-(float)(5000000*0.78); 
		while(v<h){
			v = v+(float)(v*1.002);
			m++;
		}
		System.out.println("經過"+m+"小時到達滿水位");
		
	}

}
