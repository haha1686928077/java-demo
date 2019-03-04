import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int b = sc1.nextInt();

        int num = add(a,b);
        System.out.println("add=" + num);
    }

    public static int add (int a, int b) {
        int c = a + b;
        return c;
    }
}
