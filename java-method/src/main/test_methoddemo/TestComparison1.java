import java.util.Scanner;

public class TestComparison1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int b = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入第三个数字");
        int c = sc3.nextInt();

        int d = getcompar(a, b, c);
        System.out.println("最大的数字是" + d);

    }

    public static int getcompar(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
