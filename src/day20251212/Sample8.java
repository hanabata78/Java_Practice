package day20251212;

public class Sample8 {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("エラーが発生しました");
        }
    }
}