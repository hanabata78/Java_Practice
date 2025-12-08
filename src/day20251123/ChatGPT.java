package day20251123;

public class ChatGPT {

    public static void main(String[] args) {

        int[][] scores = {
            {80, 100, 75, 90},  // 数学
            {90, 80, 50, 20}    // 英語
        };

        String[] studentName = {"菅原","遠藤","田中","西町"};
        String[] subjectName = {"数学", "英語"};

        for(int i = 0; i < scores.length; i++) {  // 教科ループ
            System.out.println("【" + subjectName[i] + "】");

            for(int j = 0; j < scores[i].length; j++) {  // 生徒ループ
                System.out.println(studentName[j] + "さん：" + scores[i][j] + "点");
            }

            System.out.println();
        }
    }
}

/*教科が増えても対応できるようにする。二次元配列(int[][])を覚える*/