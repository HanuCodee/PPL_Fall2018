package PPL_Fall2018.Week1.thaopt;

public class helloworld{
	public static void main (String[] args){
		isPrime1(3);
	}

	public static boolean isPrime1(int n) {
		for (int x = 2; x < Math.sqrt(n); x++) {
			if (n % x == 0) {
				System.out.println("So nay khong phai so nguyen to");
				return false;
			}
			
		}
		System.out.println("so nay la so nguyen to");
		return true;
	}

	public boolean isPrime2(int n) {
		for (int x = 2; x * x < n; x++) {
			if (n % x == 0) return false;
		}
		return true;
	}

	public boolean isPrime3(int n) {
		int sqrtN = (int) Math.sqrt(n);
		for (int x = 2; x < sqrtN ; x++) {
			if (n % x == 0) return false;
		}
		return true;
	}

	public boolean isPrime4(int n) {
		for (int x = (int) Math.sqrt(n); x > 2; x--) {
			if (n % x == 0) return false;
		}
		return true;
	}
}
