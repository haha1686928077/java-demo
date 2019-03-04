import java.util.Scanner;

public class TestComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int b = sc2.nextInt();

        int max = getmax(a, b);

        System.out.println("较大的数字为" + max);
    }

    public static int getmax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
