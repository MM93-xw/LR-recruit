public class FloatTest {
    public static void main(String[] args) {
        double a = 0.01 * 100;
        double b = 0.0;
        for (int i = 0; i < 100; i++) {
            b = b + 0.01;
        }

        System.out.println("0.01 * 100 = " + a);
        System.out.println("累加 100 次 0.01 = " + b);
        System.out.println("是否相等: " + (a == b));
    }
}