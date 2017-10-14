package kaoshi2;

import java.util.Scanner;

public class Login {

	/**
	 * 字符串长度 注册密码长度不少于6位
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mima;
		System.out.print("请输入用户名： ");
		scanner.next();
		System.out.print("请输入密码： ");
		mima = scanner.next();
		if (mima.length() >= 6) { // length()方法
			System.out.print("注册成功！ ");
		} else {
			System.out.print("密码长度不能小于6位！");
		}
		scanner.close();
	}
}
