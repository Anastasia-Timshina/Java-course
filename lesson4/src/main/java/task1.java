public class task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            double x = Math.random() * 10;
            int a = (int) x;
            System.out.println(i + ": " + Math.pow(a, 2));
        }
    }
}
