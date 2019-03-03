//用for实现0-100的偶数

public class Testfor3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            continue;
        }
    }
}
