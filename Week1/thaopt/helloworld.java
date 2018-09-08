public class helloworld{
	public static void main (String[] args){
		isPrime1(3);
	}

	public boolean isPrime1(int n) {
		for (int x = 2; x < Math.sqrt(n); x++) {
			if (n % x == 0) {
				System.out.pritln("So nay khong phai so nguyen to");
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
		int sqrtN = Math.sqrt(n);
		for (int x = 2; x < sqrtN ; x++) {
			if (n % x == 0) return false;
		}
		return true;
	}

	public boolean isPrime4(int n) {
		for (int x = Math.sqrt(n); x > 2; x--) {
			if (n % x == 0) return false;
		}
		return true;
	}
}
