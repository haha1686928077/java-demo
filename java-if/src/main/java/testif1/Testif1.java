public class Testif1 {
    public static void main(String[] args) {
        int a = 15;
        if (a > 10) {
            System.out.println(a);
        }

        if (a > 20) {
            System.out.println(a);
        } else {
            System.out.println("a<20");
        }

        if (a < 5) {
            System.out.println("a<5");
        } else if (a > 20) {
            System.out.println("a>20");
        } else {
            System.out.println("a=15");
        }
    }
}
