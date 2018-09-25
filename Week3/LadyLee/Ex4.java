package PPL_Fall2018.Week3.LadyLee;

public class Ex4 {
	public static void Link() {
		processUrl("/home/user/filename.png");
	}

	public static void processUrl(String url) {
		String[] parts = url.trim().split("/");

		for (String s : parts) {
			System.out.println(s);
		}
		StringBuffer dr = new StringBuffer();
		for (int i = 0; i < parts.length - 1; i++) {
			dr.append(parts[i] + "/");

			String[] part2 = parts[parts.length - 1].split("\\.");
			System.out.println("Name: " + part2[0]);
			System.out.println("Extension: " + part2[1]);
			System.out.println("Dr: " + dr.toString());
		}
	}

	public static void main(String[] args) {
		Link();
	}
}
