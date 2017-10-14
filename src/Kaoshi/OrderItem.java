package Kaoshi;

import java.util.Scanner;

/**
 * 订单类
 * 
 * @author jianjun
 * @date2017年5月17日 下午3:41:11 订单项类(OrderItem) 图书名称(bookName) 图书单价(price)
 *                 购买数量(num)
 */
public class OrderItem extends Book {
    Scanner scanner = new Scanner(System.in);

    public void fangfa1() {

        System.out.println("请输入图书编号选择图书：");
        int a = scanner.nextInt();
        fangfa(a);
        System.out.println("请输入购买图书的数量：");
        int b = scanner.nextInt();
        System.out.println("是否继续购买图书");
        String xuanze = scanner.next().trim();
        if (xuanze.equalsIgnoreCase("y")) {
            Price(b);
            System.out.println(Price(b));
        } else if (xuanze.equalsIgnoreCase("n")) {
            Price(a);
            System.out.println(Price(b));
            System.out.println("退出系统。");
            System.exit(0);
        }

    }

    public double Price(int num) {
        double sum = 0;
        switch (getBookName()) {
        case "Java教程":
            sum = num * 30.6;
            break;
        case "JSP指南":
            sum = num * 42.1;
            break;
        case "SSH架构":
            sum = num * 47.3;
            break;
        }
        return sum;

    }

    public void zhujiemian() {
        System.out.println("\t\t\t图书列表");
        System.out.println("图书编号" + "\t图书名称" + "\t图书单价");
        System.out.println("-----------------------------------------");
        System.out.println("1" + "\tJava教程" + "\t30.6");
        System.out.println("2" + "\tJSP指南" + "\t42.1");
        System.out.println("3" + "\tSSH架构" + "\t47.3");
    }

    public void fangfa(int bookId) {
        switch (bookId) {
        case 1:
            super.setBookName("Java教程");
            break;
        case 2:
            super.setBookName("JSP指南");
            break;
        case 3:
            super.setBookName("SSH架构");
            break;
        }
    }

}
