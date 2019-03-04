import java.util.Scanner;

public class TestEquar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int b = sc2.nextInt();

        boolean c = getequar(a, b);
        System.out.println(c);
    }

    public static boolean getequar(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
