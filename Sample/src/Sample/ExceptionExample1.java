package Sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");

        try {
            // 例外発生の可能性のあり
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            // ArithmeticExceptionが発生時の処理
            System.out.println("ArithmeticExceptionが発生: " + e.getMessage());
        } finally {
            // 例外の有無に関わらず、実行されるコード（オプション）
            System.out.println("割り算終了");
        }

        System.out.println("処理終了");
    }
}