package PPL_Fall2018.Week1.hoapt.day1;

import java.util.Scanner;

public class ex5 {
	/*
	 * Viáº¿t chÆ°Æ¡ng trÃ¬nh tÃ­nh tá»•ng S = 1 + 2 + 3 + â€¦ + n vá»›i n nguyÃªn 
	 * dÆ°Æ¡ng Ä‘Æ°á»£c nháº­p tá»« bÃ n phÃ­m.
	 */
	public static void main(String[] args) {
		int sum = 0;
	
		Scanner hoa = new Scanner(System.in);
		System.out.println("Nháº­p sá»‘ n ");
		int n = hoa.nextInt();
		
		/*
		 * chia trÆ°á»�ng há»£p n=0, n!=0
		 */
		sum = (n*(n+1))/2;
		System.out.println("Tá»•ng dÃ£y sá»‘ lÃ  " + sum);
		
	}

}
