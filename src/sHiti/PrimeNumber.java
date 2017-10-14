package sHiti;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入您要判断的数字:");
		int num=scanner.nextInt();
		int cot=2;
		while (num<=2){
			System.out.println("此数为质数。");
		}
		while (num % cot != 0) {
			cot++;
		}
		if (num == cot) {
		System.out.println("此数为质数");
	}else
		System.out.println("此数不是质数");
		scanner.close();
	}
}
