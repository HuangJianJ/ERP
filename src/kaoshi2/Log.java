package kaoshi2;

import java.util.Scanner;

/**
 * 忽略大小写的字符串比较 登录
 * 
 */
class Log {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String zhanghao;//账号
		String mima;//密码
		System.out.print("请输入用户名： ");
		zhanghao = scanner.next();
		System.out.print("请输入密码： ");
		mima = scanner.next();
		if (zhanghao.equalsIgnoreCase("TOM") && mima.equalsIgnoreCase("123456")) {
			System.out.print("登录成功！ ");
		} else {
			System.out.print("用户名或密码不匹配，登录失败！");
		}
		scanner.close();
	}
}
