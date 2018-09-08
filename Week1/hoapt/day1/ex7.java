package PPL_Fall2018.Week1.hoapt.day1;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		/*
		 * Viáº¿t chÆ°Æ¡ng trÃ¬nh tÃ­nh n! 
		 * vá»›i n lÃ  sá»‘ nguyÃªn dÆ°Æ¡ng Ä‘Æ°á»£c nháº­p tá»« bÃ n phÃ­m.

		 */
		int frac = 1;
		Scanner bai7 = new Scanner(System.in);
		System.out.println("Nháº­p n");
		int n = bai7.nextInt();
		if( n == 0 || n == 1) {
			System.out.println("Gia thá»«a cá»§a " + frac + " lÃ  1." );
		}else {
			for(int i=2; i<=n; i++) {
				frac *= i;
			}
			System.out.println("Giai thá»«a cá»§a " + n +" lÃ  " + frac);
		}
		/**
		 * void thÃ¬ ko cÃ³ return
		 * int báº¯t buá»™c pháº£i cÃ³ return
		 * 
		 * Ä‘á»‡ quy 2 pháº§n 
		 * + base
		 * + cÃ´ng thá»©c: gá»�i láº¡i chÃ­nh nÃ³
		 * public static int factory (int n){
		 * 		if (n == 1){
		 *			 return 1;
		 * 
		 *		 } else{			
		 * 			return n*factory(n-1);
		 * 		}
		 * }
		 */
		}

}
