package sHiti;

import java.util.Random;

public class SuiJitset {

	public static void main(String[] args) {
		Random random = new Random();
		int[] num = new int[10];
		System.out.println("随机生成数列是:");
		for (int i = 0; i < num.length; i++) {
			int num1 = random.nextInt(100);
			num[i] = num1;
			System.out.print("\t" + num1);
		}
		int min = num[0];
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
			else if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("\n此数列最小值是:" + min);
		System.out.println("\n此数列最小值是:" + max);
	}
}
