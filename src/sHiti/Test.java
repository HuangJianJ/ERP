package sHiti;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		System.out.print("随机生成的数列是:");
		for (int i = 0; i < 10; i++) {
			int num = random.nextInt(100);
			list.add(num);
		}
		System.out.println("\n" + list.toString());
		// 生成的数字是101，所以生成的每一个值都比101小，通过循环得到最小的值。
		int min = 101;
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			} else if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("此数列最小值是:" + min);
		System.out.println("此数列最大值是:" + max);

	}
}
