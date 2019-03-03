//水仙花数为：
//一个三位数个位数字的立方加十位数字的立方加百位数字的立方之和等于这个三位数
//输出水仙花数


public class Textfor4 {
    public static void main(String[] args) {

        for (int x = 100; x <= 999; x++) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
                System.out.println(x);
            }
        }
    }
}
