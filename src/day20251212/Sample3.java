package day20251212;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("佐藤");
		names.add("鈴木");
		names.add("高橋");

		// 拡張for文（業務でよく使う）
		for (String name : names) {
			System.out.println(name);
		}
	}
}