package main.java.com.go;

import java.io.IOException;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("�ɾ͵㣺2500|�ɾͽ���(x)");
        System.out.println("�Ѽ��163|293");
        System.out.println("�ȼ�(a) | ���� | ����(c) | VIP(d) | ����(e)");
        System.out.println("��Ƭ(f) | �ղ�(g) | �ۺ�(h) | ����(i)");
        System.out.println("1.����ע�����ѻ�ã�");
        System.out.println("2.�±��������ѻ�ã�");
        System.out.println("3.ǿ��֮·���ѻ�ã�");
        System.out.println("4.����Զ��ѻ�ã�");
        System.out.println("5.����֮�ģ��ѻ�ã�");

        Scanner scan = new Scanner(System.in);
        System.out.print("���");
        Object print = scan.next();
        // ˯������
        Thread.currentThread().sleep(1000 * 1);
        // ����̨����
        cls();
        main(args);
    }

    public static void cls() throws IOException, InterruptedException {
        System.out.println("---------------------next------------------------");
//        new ProcessBuilder("cmd", "/c", "cls")
//                //�� ProcessBuilder ���������ܵ��� Java �Ľ��̽��й�������������ķ���ֵҲ��һ�� ProcessBuilder
//                .inheritIO()
//                //��ʼִ�� ProcessBuilder �е�����
//                .start()
//                //�ȴ� ProcessBuilder �е���������ִ�����
//                //������ȴ��������������������������������
//                .waitFor(); // ��������
    }
}
