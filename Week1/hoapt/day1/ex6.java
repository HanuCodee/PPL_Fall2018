package PPL_Fall2018.Week1.hoapt.day1;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		/*
		 * Viáº¿t chÆ°Æ¡ng trÃ¬nh tÃ­nh tá»•ng S = 1 + 1/2 + 1/3 + â€¦ + 1/n 
		 * vá»›i n nguyÃªn dÆ°Æ¡ng Ä‘Æ°á»£c nháº­p tá»« bÃ n phÃ­m.
		 */
		double sum = 0;
		 
		Scanner bai6 = new Scanner(System.in);
		System.out.println("Nháº­p n ");
		int n = bai6.nextInt();
		 /*
		  * chia cÃ¡c trÆ°á»�ng há»£p
		  */
		if( n == 0) {
			System.out.println("PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m");
		}else {
			/*
			 * (double)(1/i) Ã©p kiá»ƒu double
			 */
		
			for(double i = 1; i<=n; i++) {
				sum += 1/i;
			}
			System.out.println("Tá»•ng dÃ£y sá»‘ lÃ  " + sum);
		}
		
		
		
		
	}

}
