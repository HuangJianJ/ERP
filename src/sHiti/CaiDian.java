package sHiti;

import java.util.Scanner;

public class CaiDian {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 99);
		System.out.println("请输入一个数字(0-99):");
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int count = 0;
		do {
			num1 = scanner.nextInt();
			if (num1 > num) {
				System.out.println("大了点");
				System.out.println("请重新输入:");
				count++;
			} else if (num1 < num) {
				System.out.println("小了点");
				System.out.println("请重新输入:");
				count++;
			} else if (num1 == num) {
				System.out.println("恭喜你猜对了");
				break;
			}
		} while (true);
		if (count <= 3)
			System.out.println("运气真好");
		else if (count <= 5 & count > 3)
			System.out.println("运气还不错");
		else if (count > 5)
			System.out.println("还需要努力");
		scanner.close();
	}
}
