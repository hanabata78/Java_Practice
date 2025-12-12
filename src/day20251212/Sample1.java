package day20251212;

public class Sample1 {
	public static void main(String[] args) {
		int score = 75; // 整数
		String name = "田中"; // 文字列

		// if文（条件分岐）
		if (score >= 80) {
			System.out.println(name + "：合格");
		} else {
			System.out.println(name + "：不合格");
		}

		// for文（繰り返し）
		for (int i = 1; i <= 3; i++) {
			System.out.println("試験回数：" + i);
		}
	}
}
