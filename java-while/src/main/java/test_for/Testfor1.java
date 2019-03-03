//输出1-100之和

package test_for;

public class Testfor1 {
    public static void main(String[] args) {
        int i = 1;
        int num = 0;

        while (i <= 100) {
            num += i;
            i++;
        }
        System.out.println(num);
    }
}

