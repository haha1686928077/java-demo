public class Conversion {
    public static void main(String[] args) {
        //类型转换：隐式转换
        // byte , short , char -- int -- long -- float -- double
        byte a, b;
        int c;
        a = 12;
        b = 15;
        c = a + b;
        System.out.println(c);

        //类型转换:强制转换
        //(目标类型) （变量名) = (目标类型) (被转换的数据)
        int e = 15;
        int f = 16;
        short j = (short) (e + f);
        System.out.println(j);

        //当数据类型为"long"或"float"时要注意
        //加这两个类型的首字母大写
        long l = 88888888888888888L;
        float m = 0.666F;
    }
}
