public class TestArrayDemo {
    public static void main(String[] args) {

//动态数组

        int a[] = new int[4];
        a[0] = 55;
        a[2] = 66;

        int a2[] = new int[3];
        a2[0] = 11;
        a2[1] = 12;
        a2[2] = 13;


        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println("...........");
        System.out.println(a2);
        System.out.println(a2[0]);
        System.out.println(a2[1]);
        System.out.println(a2[2]);
        System.out.println(".....................");

//两个数组用同一个地址

        int b[] = new int[3];
        b[0] = 99;
        b[1] = 98;
        b[2] = 97;

        int b2[] = b;

        System.out.println(b);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println("..............");
        System.out.println(b2);
        System.out.println(b2[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(".................");

//静态数组

        int c[] = {1, 2, 3, 4, 5};
        System.out.println(c);
        System.out.println(c[0]);
        System.out.println("...........");

//数组的遍历

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(".............");

//数组中获取最大值和最小值
        int max = c[0];

        for (int x = 1; x < c.length; x++) {
            if (c[x] > max) {
                max = c[x];
        }
        System.out.println(max);

        int min = c[0];

        for (int y = 1; y < c.length; y++) {
            if (c[y] < min) {
                min = c[y];
            }
        }
            System.out.println(min);
    }
}

            }