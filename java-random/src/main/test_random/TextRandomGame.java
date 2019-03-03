import java.util.Random;
import java.util.Scanner;

public class TextRandomGame {
    public static void main(String[] args) {

        Random r = new Random();
        int number = r.nextInt(100);

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("请输入你猜测的数字(0-100)");
            int shuru = s.nextInt();

            if (shuru > number) {
                System.out.println("你输入的数字大了");
            }else if (shuru < number) {
                System.out.println("你输入的数字小了");
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
