import java.util.Scanner;

public class Testif2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数据");
        int b = sc2.nextInt();

        if (a > b) {
            System.out.println(a + "比较大！");
        }else  {
            System.out.println(b + "比较大！");
        }

    }
}
