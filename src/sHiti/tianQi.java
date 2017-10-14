package sHiti;

import java.util.Scanner;

public class tianQi {
	boolean bool = false;

	public static void main(String[] args) {
		tianQi tian = new tianQi();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t*******欢迎使用Minni转换器********");
		do {
			System.out.print("请输入天气状况的第一个英文字母:");
			String tq = scanner.next();
			switch (tq) {
			case "H":
				System.out.println("炎热");
				tian.fangfa();
				break;
			case "D":
				System.out.println("干燥");
				tian.fangfa();
				break;
			case "M":
				System.out.println("潮湿");
				tian.fangfa();
				break;
			case "R":
				System.out.println("下雨");
				tian.fangfa();
				break;
			}
		} while (!tian.bool);
		scanner.close();
	}

	public void fangfa() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("您想继续吗？y/n，请输入");
		String xuanze = scanner.next().trim();
		if (xuanze.equalsIgnoreCase("y")) {
			bool = false;
		} else if (!xuanze.equalsIgnoreCase("n")) {
			System.out.println("输入错误，无法转换！");
		} else if (xuanze.equalsIgnoreCase("n")) {
			System.out.println("退出系统。");
			System.exit(0);
		}
		scanner.close();
	}
}
