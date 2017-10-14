package Kaoshi;

public class Triangle {

	public static void main(String[] args) {
		//外循环控制他的高度
		for(int i=0;i<5;i++){
			//内循环控制他的空格
			for(int k=4;k>i;k--){
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++){
				System.out.print("*");
			}System.out.println();
		}
	}
}
