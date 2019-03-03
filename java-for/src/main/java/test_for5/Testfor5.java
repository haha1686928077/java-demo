//水仙花数为：
//一个三位数个位数字的立方加十位数字的立方加百位数字的立方之和等于这个三位数
//输出水仙花数的个数
public class Testfor5 {
    public static void main(String[] args) {
        int num = 0;

        for (int x = 100; x <= 999; x++) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 100 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
                num++;
            }
        }
        System.out.println("水仙花数有" + num + "个");
    }
}
