import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("1.学生信息查询");
            System.out.println("2.添加学生信息");
            System.out.println("3.删除学生信息");
            System.out.println("4.更改学生信息");
            System.out.println("5.退出");

            String choiceString = sc.nextLine();

            switch (choiceString) {
                case "1":
                    findStudent(array);
                    break;
                case "2":
                    addStudent(array);
                    break;
                case "3":
                    deleteStudent(array);
                    break;
                case "4":
                    updateStudent(array);
                    break;
                case "5":
                default:
                    System.out.println("谢谢你的使用");
                    System.exit(0);
            }
        }

    }

    public static  void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号");
        String id = sc.nextLine();
        int index = -1;
        for(int x=0;x<array.size();x++){
            Student s = array.get(x);
            if(s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有你要修改的学生学号");
        }else{
            System.out.println("1.请输入新的学生名字");
            String name = sc.nextLine();
            System.out.println("2.请输入新的学生年龄");
            String age = sc.nextLine();
            System.out.println("3.请输入新的学生地址");
            String address = sc.nextLine();

            Student st = new Student();
            st.setId(id);
            st.setName(name);
            st.setAge(age);
            st.setAddress(address);

            array.set(index,st);
            System.out.println("学生信息修改成功");
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        int index = -1;
        if (array.size() == 0){
            System.out.println("当前没有可供选择的学号");
        }else {
            System.out.println("请输入你要删除学生的学号");
            String id = sc.nextLine();
            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);

                if (s.getId().equals(id)) {
                    index = x;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("当前没有你输入学生的学号");
            }else {
                array.remove(index);
                System.out.println("删除学生成功");
            }
        }
    }

    public static void findStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前没有学生数据，请重新选择");
        } else {
            System.out.println("姓名\t年龄\t地址\t学号");
            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);
                System.out.println(s.getName() + "\t" + s.getAge() + "  \t" + s.getAddress() + "\t" + s.getId());
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.输入学生姓名");
        String name = sc.nextLine();
        System.out.println("2.输入学生年龄");
        String age = sc.nextLine();
        System.out.println("3.输入学生地址");
        String address = sc.nextLine();
        String id;
        while (true) {
            System.out.println("4.输入学生学号");
            id = sc.nextLine();
            boolean flag = false;
            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);
                if (s.getId().equals(id))
                    flag = true;
                break;
            }
            if (flag = false) {
                System.out.println("你输入的数据有误");
            }
            System.out.println("学生信息录入完成");
            break;
        }


        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        s.setId(id);

        array.add(s);
    }
}
