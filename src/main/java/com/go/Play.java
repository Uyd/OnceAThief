package main.java.com.go;

import java.io.IOException;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("成就点：2500|成就奖励(x)");
        System.out.println("已激活：163|293");
        System.out.println("等级(a) | 副本 | 任务(c) | VIP(d) | 铸造(e)");
        System.out.println("卡片(f) | 收藏(g) | 综合(h) | 神秘(i)");
        System.out.println("1.命中注定（已获得）");
        System.out.println("2.新兵试炼（已获得）");
        System.out.println("3.强者之路（已获得）");
        System.out.println("4.威名远扬（已获得）");
        System.out.println("5.仁者之心（已获得）");

        Scanner scan = new Scanner(System.in);
        System.out.print("命令：");
        Object print = scan.next();
        // 睡眠三秒
        Thread.currentThread().sleep(1000 * 1);
        // 控制台清屏
        cls();
        main(args);
    }

    public static void cls() throws IOException, InterruptedException {
        System.out.println("---------------------next------------------------");
//        new ProcessBuilder("cmd", "/c", "cls")
//                //将 ProcessBuilder 对象的输出管道和 Java 的进程进行关联，这个函数的返回值也是一个 ProcessBuilder
//                .inheritIO()
//                //开始执行 ProcessBuilder 中的命令
//                .start()
//                //等待 ProcessBuilder 中的清屏命令执行完毕
//                //如果不等待则会出现清屏代码后面的输出被清掉的情况
//                .waitFor(); // 清屏命令
    }
}
