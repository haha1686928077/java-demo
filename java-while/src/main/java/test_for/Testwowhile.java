package test_for;

public class Testwowhile {
    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        do {
            num += i;
            i++;
        } while (i <= 100);

        System.out.println(num);
    }
}
