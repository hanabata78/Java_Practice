package day20251123;

public class Main {
		public static void main(String[] args) {
			//データの代入
			int[] score1 = {80, 100, 75, 90};
			int[] score2 = {90, 80, 50, 20};
			String[] studentName = {"菅原","あああ","いいい","ううう"};
			String[] subjectName = {"数学","英語"};
			
			//データの表示
			for(int j=0; j < subjectName.length; j++) {
				System.out.println("教科"+subjectName[j]);
			}
			for(int i=0; i < score1.length; i++) {
				System.out.println(studentName[i]+"さん:"+score1[i]+"点");
			}
			for(int i=0; i < score2.length; i++) {
				System.out.println(studentName[i]+"さん:"+score2[i]+"点");
			}

		}

	}


